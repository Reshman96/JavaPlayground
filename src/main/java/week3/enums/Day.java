package week3.enums;

import java.util.Arrays;

public enum Day {
    MONDAY("Today is Monday"),
    TUESDAY("Today is Tuesday"),
    WEDNESDAY("Today is Wednesday"),
    THURSDAY("Today is Thursday"),
    FRIDAY("Today is Friday"),
    SATURDAY("Today is Saturday"),
    SUNDAY("Today is Sunday");

    private String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        Day friday = Day.FRIDAY;
        System.out.println(Day.MONDAY.compareTo(Day.WEDNESDAY));
        System.out.println(Arrays.toString(Day.values()));
    }
}


