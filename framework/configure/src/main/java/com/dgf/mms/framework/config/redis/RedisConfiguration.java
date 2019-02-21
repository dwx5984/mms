package com.dgf.mms.framework.config.redis;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * <p>
 *     redis配置
 * </p>
 * @author dengganfeng
 * @since 2019-02-21 01:39:37
 */

@EnableCaching
@Configuration
@EnableRedisHttpSession
public class RedisConfiguration {
    @Bean
    public static ConfigureRedisAction configureRedisAction() {
        //让springSession不再执行config命令
        return ConfigureRedisAction.NO_OP;
    }
}
