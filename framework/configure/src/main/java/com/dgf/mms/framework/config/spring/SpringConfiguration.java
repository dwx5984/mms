package com.dgf.mms.framework.config.spring;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>
 *     spring配置加载入口
 * </p>
 * 约定加载的文件模式
 * @author dengganfeng
 * @since 2019-02-20 23:29:10
 */
@SpringBootConfiguration
@ComponentScan("com.dgf.mms")
@ImportResource("classpath*:/mms-spring-*.xml")
public class SpringConfiguration {

}