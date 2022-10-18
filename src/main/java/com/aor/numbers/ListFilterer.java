package com.aor.numbers;

import java.util.List;

public class ListFilterer implements GenericListFilter {
    private final GenericListFilter filter;
    public ListFilterer(GenericListFilter filter) {this.filter = filter;}

    public List<Integer> filter(List<Integer> list) {
        
        return list;
    }

    public boolean accept(Integer number) {
        return false;
    }
}
