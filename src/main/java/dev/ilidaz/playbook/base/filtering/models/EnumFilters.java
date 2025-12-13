package dev.ilidaz.playbook.base.filtering.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;

/**
 * A class for filtering by enum values.
 *
 * @param <E> the enum type
 */
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class EnumFilters<E extends Enum<E>> implements Serializable {
    /**
     * The value that the enum field should be equal to.
     */
    private E equalTo;
    /**
     * The value that the enum field should not be equal to.
     */
    private E notEqualTo;
    /**
     * A set of values that the enum field should be in.
     */
    private Set<E> in;
    /**
     * A set of values that the enum field should not be in.
     */
    private Set<E> notIn;
    /**
     * A boolean indicating whether the enum field should be null.
     */
    private Boolean isNull;
}
