package io.ti.rpc.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 服务提供者注解
 * @author ZhiRong.Fang
 * @date 2023/10/16 15:20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface RpcService {

    /**
     * 接口的Class
     */
    Class<?> interfaceClass() default void.class;

    /**
     * 接口的ClassName
     */
    String interfaceName() default "";

    /**
     * 版本号
     */
    String version() default "1.0.1";

    /**
     * 服务分组
     */
    String group() default "";


}
