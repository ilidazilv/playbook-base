package dev.ilidaz.playbook.base.filtering.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A class for filtering by lists of double values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class DoubleListFilters extends BaseListFilters<Double> implements Serializable {
}
