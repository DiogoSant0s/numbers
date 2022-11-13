package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    private final int divider;
    public DivisibleByFilter(int divider) {this.divider = divider;}
    public boolean accept(Integer number) {return number % divider == 0;}
}
