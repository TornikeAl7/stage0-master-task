package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int daysInMonth = getDaysInMonth(year, month);

        if (daysInMonth == -1) {
            System.out.println("Invalid date: Unknown month.");
        } else {
            System.out.println(daysInMonth);
        }
    }

    private int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // Unknown month
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
