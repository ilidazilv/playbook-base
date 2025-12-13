package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.NumberFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A class for filtering by double values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class DoubleFilters extends BaseFilters<Double> implements Serializable, NumberFilters<Double> {
    /**
     * The value that the field should be greater than.
     */
    private Double greaterThan;
    /**
     * The value that the field should be greater than or equal to.
     */
    private Double greaterThanEquals;
    /**
     * The value that the field should be lower than.
     */
    private Double lowerThan;
    /**
     * The value that the field should be lower than or equal to.
     */
    private Double lowerThanEquals;
}
