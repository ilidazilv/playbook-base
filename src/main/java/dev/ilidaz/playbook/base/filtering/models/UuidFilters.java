package dev.ilidaz.playbook.base.filtering.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder
public class UuidFilters extends BaseFilters<UUID> implements Serializable {

}
