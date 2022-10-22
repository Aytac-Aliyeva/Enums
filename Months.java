package enums;

import java.util.Objects;

public enum Months {
    DECEMBER(1),
    JANUARY(2),
    FEBRUARY(3),
    MARCH(4),
    APRIL(5),
    MAY(6),
    JUNE(7),
    JULY(8),
    AUGUST(9),
    SEPTEMBER(10),
    NOVEMBER(11),
    OCTOBER(12);


    private final Integer number;


    Months(Integer number) {
        this.number = number;
    }

    public static Months matchMonthsToNumbers(Integer myNumber) {
        Months[] values = Months.values();
        for (Months m : values) {
            if (Objects.equals(m.number, myNumber)) {
                return m;
            }
        }
        return null;

    }


    public static int[] bubbleSort(int[] array) {
        int length = array.length;
        int j = 0, i = 0;
        boolean isSorted;
        for (i = 0; i < length; i++) {

            for (j = 0; j < length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }

        }


        return array;
    }
}




