package org.wby4j.framework.aop.annotation;

import java.lang.annotation.*;

/**
 * 定义切面类
 *
 * @Author wubinyu
 * @Date 2018/8/16 16:53.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 包名
     *
     * @return
     */
    String pkg() default "";

    /**
     * 类名
     *
     * @return
     */
    String cls() default "";

    /**
     * 注解
     *
     * @return
     */
    Class<? extends Annotation> annotation() default Aspect.class;
}
