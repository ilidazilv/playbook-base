package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.DateFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A class for filtering by local date values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class LocalDateFilters extends BaseFilters<LocalDate> implements Serializable, DateFilters<LocalDate> {
    /**
     * The value that the field should be greater than.
     */
    private LocalDate greaterThan;
    /**
     * The value that the field should be greater than or equal to.
     */
    private LocalDate greaterThanEquals;
    /**
     * The value that the field should be lower than.
     */
    private LocalDate lowerThan;
    /**
     * The value that the field should be lower than or equal to.
     */
    private LocalDate lowerThanEquals;
}
