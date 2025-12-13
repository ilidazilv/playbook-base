package dev.ilidaz.playbook.base.filtering.interfaces;

/**
 * An interface for filtering by number values.
 *
 * @param <N> the type of the number
 */
public interface NumberFilters<N extends Number> {
    /**
     * Returns the value that the field should be greater than.
     *
     * @return the value that the field should be greater than
     */
    N getGreaterThan();

    /**
     * Returns the value that the field should be greater than or equal to.
     *
     * @return the value that the field should be greater than or equal to
     */
    N getGreaterThanEquals();

    /**
     * Returns the value that the field should be lower than.
     *
     * @return the value that the field should be lower than
     */
    N getLowerThan();

    /**
     * Returns the value that the field should be lower than or equal to.
     *
     * @return the value that the field should be lower than or equal to
     */
    N getLowerThanEquals();
}
