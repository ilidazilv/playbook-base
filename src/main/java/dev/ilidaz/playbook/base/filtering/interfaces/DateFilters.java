package dev.ilidaz.playbook.base.filtering.interfaces;

import java.io.Serializable;
import java.time.temporal.Temporal;

/**
 * An interface for filtering by date values.
 *
 * @param <D> the type of the date, which must be a temporal, serializable, and comparable type
 */
public interface DateFilters<D extends Temporal & Serializable & Comparable> {
    /**
     * Returns the value that the field should be greater than.
     *
     * @return the value that the field should be greater than
     */
    D getGreaterThan();

    /**
     * Returns the value that the field should be greater than or equal to.
     *
     * @return the value that the field should be greater than or equal to
     */
    D getGreaterThanEquals();

    /**
     * Returns the value that the field should be lower than.
     *
     * @return the value that the field should be lower than
     */
    D getLowerThan();

    /**
     * Returns the value that the field should be lower than or equal to.
     *
     * @return the value that the field should be lower than or equal to
     */
    D getLowerThanEquals();
}
