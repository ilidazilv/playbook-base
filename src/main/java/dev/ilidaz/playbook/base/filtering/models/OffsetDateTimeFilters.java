package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.DateFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * A class for filtering by offset date time values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class OffsetDateTimeFilters extends BaseFilters<OffsetDateTime> implements Serializable, DateFilters<OffsetDateTime> {
    /**
     * The value that the field should be greater than.
     */
    private OffsetDateTime greaterThan;
    /**
     * The value that the field should be greater than or equal to.
     */
    private OffsetDateTime greaterThanEquals;
    /**
     * The value that the field should be lower than.
     */
    private OffsetDateTime lowerThan;
    /**
     * The value that the field should be lower than or equal to.
     */
    private OffsetDateTime lowerThanEquals;
}
