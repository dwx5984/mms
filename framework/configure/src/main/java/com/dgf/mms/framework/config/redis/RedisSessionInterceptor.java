package com.dgf.mms.framework.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * <p>
 *     拦截器拦截未登录用户
 * </p>
 * @author dengganfeng
 * @since 2019-02-21 00:54:09
 */
//拦截登录失效的请求
public class RedisSessionInterceptor implements HandlerInterceptor {

    @Value("${session.login.user.key}")
    private String sessionLoginKey;

    //@Autowired

    private StringRedisTemplate redisTemplate = new StringRedisTemplate();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //无论访问的地址是不是正确的，都进行登录验证，登录成功后的访问再进行分发，404的访问自然会进入到错误控制器中
        HttpSession session = request.getSession();
        System.out.println("呵呵呵呵呵：：："+session.getAttribute(sessionLoginKey));
        if (session.getAttribute(sessionLoginKey) != null) {
            try {
                //验证当前请求的session是否是已登录的session
                String loginSessionId = redisTemplate.opsForValue().get("loginUser:" + (long) session.getAttribute(sessionLoginKey));
                if (loginSessionId != null && loginSessionId.equals(session.getId())) {
                    return true;
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        response401(response);
        return false;
    }

    private void response401(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");

        try
        {
            response.getWriter().print("401: 用户未登录！");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {

    }
}
