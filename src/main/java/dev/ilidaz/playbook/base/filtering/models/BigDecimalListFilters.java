package dev.ilidaz.playbook.base.filtering.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A class for filtering by lists of big decimal values.
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class BigDecimalListFilters extends BaseListFilters<BigDecimal> implements Serializable {
}
