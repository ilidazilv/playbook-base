package dev.ilidaz.playbook.base.filtering.models;

import dev.ilidaz.playbook.base.filtering.interfaces.NumberFilters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class LongFilters extends BaseFilters<Long> implements Serializable, NumberFilters<Long> {
    private Long greaterThan;
    private Long greaterThanEquals;
    private Long lowerThan;
    private Long lowerThanEquals;
}
