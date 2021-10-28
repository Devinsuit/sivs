package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 1;
        while (amount + (amount * percent) / 100  - salary > 0) {
            year += 1;
            amount = amount + (amount * percent) / 100  - salary;
        }
        return year;
    }
}
