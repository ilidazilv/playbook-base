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
@SuperBuilder(builderMethodName = "baseFiltersBuilder")
public class BaseFilters<C extends Serializable> implements Serializable {
    private C equalTo;
    private C notEqualTo;
    private Set<C> in;
    private Set<C> notIn;
    private Boolean isNull;
}
