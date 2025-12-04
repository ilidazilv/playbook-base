package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.DateFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.Instant;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class InstantFilters extends BaseFilters<Instant> implements Serializable, DateFilters<Instant> {
    private Instant greaterThan;
    private Instant greaterThanEquals;
    private Instant lowerThan;
    private Instant lowerThanEquals;
}