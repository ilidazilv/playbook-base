package dev.ilidaz.playbook.base.filtering.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A class for filtering by string values.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class StringFilters extends BaseFilters<String> implements Serializable {
    /**
     * The value that the field should contain.
     */
    private String contains;
    /**
     * The value that the field should not contain.
     */
    private String notContains;
    /**
     * The case-insensitive regular expression that the field should match.
     */
    private String iregex;
    /**
     * The case-insensitive regular expression that the field should not match.
     */
    private String notIregex;
    /**
     * The value that the field should start with.
     */
    private String startsWith;
    /**
     * The value that the field should end with.
     */
    private String endsWith;
}
