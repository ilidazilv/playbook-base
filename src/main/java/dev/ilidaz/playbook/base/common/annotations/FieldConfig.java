package dev.ilidaz.playbook.base.common.annotations;

import dev.ilidaz.playbook.base.common.enums.RelationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface FieldConfig {
    String path() default "";

    RelationType relationType() default RelationType.SINGLE;
}
