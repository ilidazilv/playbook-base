package dev.ilidaz.playbook.base.filtering.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for configuring a filter DTO.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface FilterConfig {
    /**
     * The entity class to which the filter applies.
     *
     * @return the entity class
     */
    Class<?> entityClass();

    /**
     * The path of the filter.
     *
     * @return the path of the filter
     */
    String path() default "";
}
