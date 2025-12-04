package dev.ilidaz.playbook.base.filtering.interfaces;

import java.io.Serializable;
import java.time.temporal.Temporal;

public interface DateFilters<D extends Temporal & Serializable & Comparable> {
    D getGreaterThan();
    D getGreaterThanEquals();
    D getLowerThan();
    D getLowerThanEquals();
}
