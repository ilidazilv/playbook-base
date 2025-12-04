package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.DateFilters;
import dev.ilidaz.playbook.base.filtering.interfaces.NumberFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class LocalDateFilters extends BaseFilters<LocalDate> implements Serializable, DateFilters<LocalDate> {
    private LocalDate greaterThan;
    private LocalDate greaterThanEquals;
    private LocalDate lowerThan;
    private LocalDate lowerThanEquals;
}