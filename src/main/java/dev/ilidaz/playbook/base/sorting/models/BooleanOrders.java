package dev.ilidaz.playbook.base.sorting.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class BooleanOrders extends BaseOrder implements Serializable {
}
