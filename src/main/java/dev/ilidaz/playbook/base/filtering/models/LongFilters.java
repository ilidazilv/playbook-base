package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.NumberFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A class for filtering by long values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class LongFilters extends BaseFilters<Long> implements Serializable, NumberFilters<Long> {
    /**
     * The value that the field should be greater than.
     */
    private Long greaterThan;
    /**
     * The value that the field should be greater than or equal to.
     */
    private Long greaterThanEquals;
    /**
     * The value that the field should be lower than.
     */
    private Long lowerThan;
    /**
     * The value that the field should be lower than or equal to.
     */
    private Long lowerThanEquals;
}
