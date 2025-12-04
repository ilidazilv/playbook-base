package dev.ilidaz.playbook.base.filtering.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "baseListFiltersBuilder")
public class BaseListFilters<C extends Serializable> implements Serializable {
    private Set<C> contains;
    private Set<C> notContains;
    private Set<C> containsAll;
    private Set<C> notContainsAll;
    private Integer sizeGt;
    private Integer sizeLe;
    private Boolean isNull;
}
