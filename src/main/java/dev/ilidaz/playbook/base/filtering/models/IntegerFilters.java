package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.NumberFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A class for filtering by integer values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class IntegerFilters extends BaseFilters<Integer> implements Serializable, NumberFilters<Integer> {
    /**
     * The value that the field should be greater than.
     */
    private Integer greaterThan;
    /**
     * The value that the field should be greater than or equal to.
     */
    private Integer greaterThanEquals;
    /**
     * The value that the field should be lower than.
     */
    private Integer lowerThan;
    /**
     * The value that the field should be lower than or equal to.
     */
    private Integer lowerThanEquals;
}
