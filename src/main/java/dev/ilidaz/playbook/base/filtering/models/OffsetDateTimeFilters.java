package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.DateFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class OffsetDateTimeFilters extends BaseFilters<OffsetDateTime> implements Serializable, DateFilters<OffsetDateTime> {
    private OffsetDateTime greaterThan;
    private OffsetDateTime greaterThanEquals;
    private OffsetDateTime lowerThan;
    private OffsetDateTime lowerThanEquals;
}