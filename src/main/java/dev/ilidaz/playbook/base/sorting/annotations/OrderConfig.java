package dev.ilidaz.playbook.base.sorting.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface OrderConfig {
    Class<?> entityClass();

    String path() default "";
}
