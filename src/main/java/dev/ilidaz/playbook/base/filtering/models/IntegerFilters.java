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
public class IntegerFilters extends BaseFilters<Integer> implements Serializable, NumberFilters<Integer> {
    private Integer greaterThan;
    private Integer greaterThanEquals;
    private Integer lowerThan;
    private Integer lowerThanEquals;
}
