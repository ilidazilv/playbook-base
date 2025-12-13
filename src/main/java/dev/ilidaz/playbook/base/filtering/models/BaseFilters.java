package dev.ilidaz.playbook.base.filtering.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;

/**
 * Base class for filtering criteria.
 *
 * @param <C> the type of the criteria, which must be serializable
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "baseFiltersBuilder")
public class BaseFilters<C extends Serializable> implements Serializable {
    /**
     * The value that the field should be equal to.
     */
    private C equalTo;
    /**
     * The value that the field should not be equal to.
     */
    private C notEqualTo;
    /**
     * A set of values that the field should be in.
     */
    private Set<C> in;
    /**
     * A set of values that the field should not be in.
     */
    private Set<C> notIn;
    /**
     * A boolean indicating whether the field should be null.
     */
    private Boolean isNull;
}
