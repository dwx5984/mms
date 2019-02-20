package com.dgf.mms.framework.config.spring;

import com.dgf.mms.framework.config.redis.RedisSessionInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p>
 *     登录拦截器
 * </p>
 * @author dengganfeng
 * @since 2019-02-21 01:10:09
 */
@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {
    @Bean
    public RedisSessionInterceptor getSessionInterceptor()
    {
        return new RedisSessionInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //所有已api开头的访问都要进入RedisSessionInterceptor拦截器进行登录验证，并排除login接口(全路径)。必须写成链式，分别设置的话会创建多个拦截器。
        //必须写成getSessionInterceptor()，否则SessionInterceptor中的@Autowired会无效
        registry.addInterceptor(getSessionInterceptor()).addPathPatterns("//medicine/medicine/**").excludePathPatterns("/medicine/medicine/list");
        super.addInterceptors(registry);
    }
}
