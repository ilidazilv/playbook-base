package dev.ilidaz.playbook.base.filtering.annotations;

import dev.ilidaz.playbook.base.filtering.enums.RelationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for configuring a field for filtering.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface FieldConfig {
    /**
     * The path of the field.
     *
     * @return the path of the field
     */
    String path() default "";

    RelationType relationType() default RelationType.SINGLE;
}
