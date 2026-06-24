package dev.ilidaz.playbook.base.sorting.models;

import dev.ilidaz.playbook.base.sorting.enums.NullsOrder;
import dev.ilidaz.playbook.base.sorting.enums.SortDirection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(builderMethodName = "baseOrderBuilder")
public abstract class BaseOrder implements Serializable {
    private SortDirection direction;
    private NullsOrder nullsOrder;
}
