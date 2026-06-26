package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.NumberFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A class for filtering by big decimal values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class BigDecimalFilters extends BaseFilters<BigDecimal> implements Serializable, NumberFilters<BigDecimal> {
    /**
     * The value that the field should be greater than.
     */
    private BigDecimal greaterThan;
    /**
     * The value that the field should be greater than or equal to.
     */
    private BigDecimal greaterThanEquals;
    /**
     * The value that the field should be lower than.
     */
    private BigDecimal lowerThan;
    /**
     * The value that the field should be lower than or equal to.
     */
    private BigDecimal lowerThanEquals;
}
