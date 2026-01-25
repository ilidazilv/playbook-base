package dev.ilidaz.playbook.base.filtering.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@SuperBuilder
public class BooleanFilters extends BaseFilters<Boolean> implements Serializable {
}
