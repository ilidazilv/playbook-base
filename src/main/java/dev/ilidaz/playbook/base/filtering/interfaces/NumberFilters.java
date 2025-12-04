package dev.ilidaz.playbook.base.filtering.interfaces;

public interface NumberFilters<N extends Number> {
    N getGreaterThan();
    N getGreaterThanEquals();
    N getLowerThan();
    N getLowerThanEquals();
}
