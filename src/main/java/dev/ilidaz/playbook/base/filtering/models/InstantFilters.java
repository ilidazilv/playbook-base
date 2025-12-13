package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.DateFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;

/**
 * A class for filtering by instant values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class InstantFilters extends BaseFilters<Instant> implements Serializable, DateFilters<Instant> {
    /**
     * The value that the field should be greater than.
     */
    private Instant greaterThan;
    /**
     * The value that the field should be greater than or equal to.
     */
    private Instant greaterThanEquals;
    /**
     * The value that the field should be lower than.
     */
    private Instant lowerThan;
    /**
     * The value that the field should be lower than or equal to.
     */
    private Instant lowerThanEquals;
}
