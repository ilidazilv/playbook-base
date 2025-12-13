package dev.ilidaz.playbook.base.filtering.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;

/**
 * Base class for filtering criteria for lists.
 *
 * @param <C> the type of the criteria, which must be serializable
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "baseListFiltersBuilder")
public class BaseListFilters<C extends Serializable> implements Serializable {
    /**
     * A set of values that the list should contain.
     */
    private Set<C> contains;
    /**
     * A set of values that the list should not contain.
     */
    private Set<C> notContains;
    /**
     * A set of values that the list should contain all of.
     */
    private Set<C> containsAll;
    /**
     * A set of values that the list should not contain all of.
     */
    private Set<C> notContainsAll;
    /**
     * The size that the list should be greater than.
     */
    private Integer sizeGt;
    /**
     * The size that the list should be less than or equal to.
     */
    private Integer sizeLe;
    /**
     * A boolean indicating whether the list should be null.
     */
    private Boolean isNull;
}
