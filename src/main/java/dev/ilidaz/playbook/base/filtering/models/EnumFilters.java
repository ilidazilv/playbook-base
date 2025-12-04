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
@SuperBuilder
@AllArgsConstructor
public class EnumFilters<E extends Enum<E>> implements Serializable {
    private E equalTo;
    private E notEqualTo;
    private Set<E> in;
    private Set<E> notIn;
    private Boolean isNull;
}
