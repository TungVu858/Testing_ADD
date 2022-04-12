package baitap;

public class NextDayCalculator {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        boolean Divison100 = year % 100 == 0;
        boolean Divison4 = year % 4 == 0;

        if (Divison100) {
            boolean Division400 = year % 400 == 0;
            if (Division400) {
                isLeapYear = true;
            }
        } else if (Divison4) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static String tomorrow(int day, int month, int year) {
        final boolean isMonth31Day = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        final boolean isMonth2 = month == 2;
        final boolean isMonth30Day = month == 4 || month == 6 || month == 9 || month == 11;
        final boolean is30Day = day == 30;
        final boolean is31Day = day == 31;
        final boolean is28Day = day == 28;
        final boolean is29Day = day == 29;
        if (isMonth2) {
            if (isLeapYear(year)) {
                if (is29Day) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
            } else if (is28Day) {
                day = 1;
                month++;
            } else {
                day++;
            }
        } else if (isMonth31Day) {
            if (is31Day) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else {
                day++;
            }
        } else if (isMonth30Day) {
            if (is30Day) {
                day = 1;
                month++;
            } else {
                day++;
            }
        }
        return day + "/" + month + "/" + year;
    }
}
