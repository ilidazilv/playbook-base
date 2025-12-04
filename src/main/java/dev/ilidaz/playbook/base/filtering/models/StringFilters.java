package dev.ilidaz.playbook.base.filtering.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class StringFilters extends BaseFilters<String> implements Serializable {
    private String contains;
    private String notContains;
    private String iregex;
    private String notIregex;
    private String startsWith;
    private String endsWith;
}
