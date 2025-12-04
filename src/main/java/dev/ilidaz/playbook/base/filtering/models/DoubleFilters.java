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
public class DoubleFilters extends BaseFilters<Double> implements Serializable, NumberFilters<Double> {
    private Double greaterThan;
    private Double greaterThanEquals;
    private Double lowerThan;
    private Double lowerThanEquals;
}