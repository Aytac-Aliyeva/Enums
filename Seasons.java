package enums;

import java.util.Objects;

import static enums.Months.*;


public enum Seasons {

    WINTER(1, "winter", new Months[]{DECEMBER, JANUARY, FEBRUARY}),
    SPRING(2, "spring", new Months[]{MARCH, APRIL, MAY}),
    SUMMER(3, "summer", new Months[]{JUNE, JULY, AUGUST}),
    AUTUMN(4, "autumn", new Months[]{SEPTEMBER, OCTOBER, NOVEMBER});

    private final Integer number;
    private final String name;
    private final Months[] months;


    Seasons(Integer number, String name, Months[] months) {
        this.number = number;
        this.name = name;
        this.months = months;
    }


    public static Months[] getMonthsNames(Seasons myEnums) {
        Seasons[] values = Seasons.values();
        for (Seasons s : values) {
            if (s.equals(myEnums)) {
                return s.months;
            }

        }
        return null;
    }


    public static Seasons matchSeasonsToNumbers(Integer myNumber) {
        Seasons[] values = Seasons.values();
        for (Seasons s : values) {
            if (Objects.equals(s.number, myNumber)) {
                return s;
            }
        }
        return null;



    }
}




