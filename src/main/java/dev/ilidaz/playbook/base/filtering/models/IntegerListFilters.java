package dev.ilidaz.playbook.base.filtering.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class IntegerListFilters extends BaseListFilters<Integer> implements Serializable {
}