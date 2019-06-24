package test;

import java.lang.Integer;

abstract class Number {
    int number;
    String type;

    @Override
    public String toString() { return Integer.toString(number); }

    Number add(Number other) { return NumberFactory.setNumber(number + other.number, type); }
    Number sub(Number other) { return NumberFactory.setNumber(number - other.number, type); }
    Number mul(Number other) { return NumberFactory.setNumber(number * other.number, type); }
    Number div(Number other) { return NumberFactory.setNumber(number / other.number, type); }
}
