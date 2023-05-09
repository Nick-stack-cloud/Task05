package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {

    public static String RIGHT = "completed successfully. WELL DONE!!!";
    public static String WRONG = "was not running successfully. Something was WRONG!";

    public static String testingTask01() {
        boolean result = Task01.task01(7, 7, 7, 7) == 4
                && Task01.task01(7, 7, 7, 8) == 3
                && Task01.task01(7, 7, 8, 9) == 2
                && Task01.task01(6, 7, 8, 9) == 0
                && Task01.task01(-7, -7, -7, -7) == 4
                && Task01.task01(7, 7, 8, 7) == 3
                && Task01.task01(7, 8, 7, 7) == 3
                && Task01.task01(8, 7, 7, 7) == 3
                && Task01.task01(7, 8, 9, 7) == 2
                && Task01.task01(7, 9, 8, 7) == 2
                && Task01.task01(8, 9, 7, 7) == 2;

        return String.format("Task 01 [The same Numbers] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask02() {
        boolean result = Task02.task02(1, 2, 3, 4).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task02.task02(2, 4, 6, 8).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task02.task02(15, 10, 5, 0).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task02.task02(7, 7, 7, 7).trim().equalsIgnoreCase("Monotonic arithmetic progression.")
                && Task02.task02(2, 4, 8, 16).trim().equalsIgnoreCase("No arithmetic progression.")

                && Task02.task02(3, 5, 7, 9).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task02.task02(9, 11, 13, 15).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task02.task02(8, 10, 12, 14).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task02.task02(-15, -13, -11, -9).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task02.task02(-9, -7, -5, -3).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task02.task02(-4, -1, 2, 5).trim().equalsIgnoreCase("Ascending arithmetic progression.")
                && Task02.task02(-16, -12, -8, -4).trim().equalsIgnoreCase("Ascending arithmetic progression.")

                && Task02.task02(-2, -7, -12, -17).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task02.task02(17, 12, 7, 2).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task02.task02(37, 31, 25, 19).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task02.task02(-19, -25, -31, -37).trim().equalsIgnoreCase("Descending arithmetic progression.")
                && Task02.task02(5, 2, -1, -4).trim().equalsIgnoreCase("Descending arithmetic progression.")

                && Task02.task02(-7, -7, -7, -7).trim().equalsIgnoreCase("Monotonic arithmetic progression.")
                && Task02.task02(0, 0, 0, 0).trim().equalsIgnoreCase("Monotonic arithmetic progression.")

                && Task02.task02(1, 1, 2, 3).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(3, 2, 1, 1).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(2, 3, 5, 7).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(7, 5, 3, 2).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(-1, -1, -2, -3).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(-3, -2, -1, -1).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(-2, -3, -5, -7).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(-7, -5, -3, -2).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(2, 3, 7, 8).trim().equalsIgnoreCase("No arithmetic progression.")
                && Task02.task02(8, 7, 3, 2).trim().equalsIgnoreCase("No arithmetic progression.");

        return String.format("Task 02 [Arithmetic progression] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask03() {
        boolean result = !Task03.task03(2023)
                && Task03.task03(1984)
                && Task03.task03(2000)
                && Task03.task03(0)
                && !Task03.task03(-100)

                && Task03.task03(1600)
                && Task03.task03(1704)
                && Task03.task03(1808)
                && Task03.task03(1912)
                && Task03.task03(2124)
                && Task03.task03(2248)
                && Task03.task03(2352)

                && !Task03.task03(3000)
                && !Task03.task03(1700)
                && !Task03.task03(1800)
                && !Task03.task03(1900)
                && !Task03.task03(2100)
                && !Task03.task03(2200)
                && !Task03.task03(2300)

                && Task03.task03(-1600)
                && Task03.task03(-1704)
                && Task03.task03(-1808)
                && Task03.task03(-1912)
                && Task03.task03(-2124)
                && Task03.task03(-2248)
                && Task03.task03(-2352)

                && !Task03.task03(-3000)
                && !Task03.task03(-1700)
                && !Task03.task03(-1800)
                && !Task03.task03(-1900)
                && !Task03.task03(-2100)
                && !Task03.task03(-2200)
                && !Task03.task03(-2300);

        return String.format("Task 03 [The Leap Year] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask04() {
        boolean result = Task04.task04(4, 2023) == 30
                && Task04.task04(5, 2023) == 31
                && Task04.task04(2, 1900) == 28
                && Task04.task04(-7, 2023) == 0
                && Task04.task04(0, 2023) == 0
                && Task04.task04(13, 2023) == 0

                && Task04.task04(2, 2023) == 28
                && Task04.task04(2, 1984) == 29
                && Task04.task04(2, 2000) == 29
                && Task04.task04(2, 0) == 29
                && Task04.task04(2, -100) == 28
                && Task04.task04(2, -2300) == 28
                && Task04.task04(2, 2300) == 28

                && Task04.task04(6, 2023) == 30
                && Task04.task04(9, 2023) == 30
                && Task04.task04(11, 2023) == 30

                && Task04.task04(1, 2023) == 31
                && Task04.task04(3, 2023) == 31
                && Task04.task04(7, 2023) == 31
                && Task04.task04(8, 2023) == 31
                && Task04.task04(10, 2023) == 31
                && Task04.task04(12, 2023) == 31;

        return String.format("Task 04 [Amount of days] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask05() {
        boolean result = Task05.task05(1, 2, 3) == 2
                && Task05.task05(17, 23, 11) == 17
                && Task05.task05(7, 7, 7) == 0
                && Task05.task05(5, 7, 7) == 0

                && Task05.task05(7, 5, 7) == 0
                && Task05.task05(7, 7, 5) == 0
                && Task05.task05(0, 0, 0) == 0
                && Task05.task05(-7, -7, -7) == 0
                && Task05.task05(-7, -5, -7) == 0
                && Task05.task05(-7, -7, -5) == 0
                && Task05.task05(7, -5, 7) == 0
                && Task05.task05(7, 7, -5) == 0

                && Task05.task05(23, 11, 17) == 17
                && Task05.task05(11, 17, 23) == 17
                && Task05.task05(-1, -2, -3) == -2
                && Task05.task05(-2, -1, -3) == -2
                && Task05.task05(-3, -1, -2) == -2
                && Task05.task05(-7, 5, 7) == 5
                && Task05.task05(7, -7, 5) == 5
                && Task05.task05(7, 5, -7) == 5
                && Task05.task05(5, 7, -7) == 5;

        return String.format("Task 05 [The Average Number] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask06() {
        boolean result = Task06.task06(0).trim().equalsIgnoreCase("green")
                && Task06.task06(1).trim().equalsIgnoreCase("red")
                && Task06.task06(2).trim().equalsIgnoreCase("black")
                && Task06.task06(-1).trim().equalsIgnoreCase("error")
                && Task06.task06(37).trim().equalsIgnoreCase("error");

        int[] reds = {3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
        int[] blacks = {4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

        for (int item : reds) {
            result = result && Task06.task06(item).trim().equalsIgnoreCase("red");
        }

        for (int item : blacks) {
            result = result && Task06.task06(item).trim().equalsIgnoreCase("black");
        }

//        for (int i = 1; i <= 36; i += 2) {
//            result = result && Task06.task06(i).trim().equalsIgnoreCase("red");
//            if (i == 9) {
//                i = 12;
//            } else if (i == 18) {
//                i = 19;
//            } else if (i == 27) {
//                i = 30;
//            }
//        }
//
//        for (int i = 2; i <= 36; i += 2) {
//            result = result && Task06.task06(i).trim().equalsIgnoreCase("black");
//            if (i == 10) {
//                i = 11;
//            } else if (i == 17) {
//                i = 20;
//            } else if (i == 28) {
//                i = 29;
//            }
//        }

        return String.format("Task 06 [Roulette Wheel Colors] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask07() {
        boolean result = Task07.task07("red", "blue").trim().equalsIgnoreCase("violet")
                && Task07.task07("blue", "yellow").trim().equalsIgnoreCase("green")
                && Task07.task07("red", "red").trim().equalsIgnoreCase("red")
                && Task07.task07("pink", "red").trim().equalsIgnoreCase("error")

                && Task07.task07("blue", "red").trim().equalsIgnoreCase("violet")
                && Task07.task07("red", "yellow").trim().equalsIgnoreCase("orange")
                && Task07.task07("yellow", "red").trim().equalsIgnoreCase("orange")
                && Task07.task07("yellow", "blue").trim().equalsIgnoreCase("green")

                && Task07.task07("yellow", "yellow").trim().equalsIgnoreCase("yellow")
                && Task07.task07("blue", "blue").trim().equalsIgnoreCase("blue")

                && Task07.task07("", "blue").trim().equalsIgnoreCase("error")
                && Task07.task07("blue", "").trim().equalsIgnoreCase("error")
                && Task07.task07("", "").trim().equalsIgnoreCase("error")
                && Task07.task07(null, "blue").trim().equalsIgnoreCase("error")
                && Task07.task07("blue", null).trim().equalsIgnoreCase("error")
                && Task07.task07(null, null).trim().equalsIgnoreCase("error");

        return String.format("Task 07 [Color Mixer] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask08() {
        boolean result = Task08.task08(3, 5, 2023).trim().equals("04.05.2023")
                && Task08.task08(28, 2, 2023).trim().equals("01.03.2023")
                && Task08.task08(28, 2, 2020).trim().equals("29.02.2020")
                && Task08.task08(30, 2, 2020).trim().equalsIgnoreCase("Error.")
                && Task08.task08(1, 13, 2020).trim().equalsIgnoreCase("Error.")
                && Task08.task08(1, -1, 2020).trim().equalsIgnoreCase("Error.")
                && Task08.task08(1, 1, -1).trim().equalsIgnoreCase("Error.")
                && Task08.task08(29, 2, 2023).trim().equalsIgnoreCase("Error.")
                && Task08.task08(29, 2, 1900).trim().equalsIgnoreCase("Error.")
                && Task08.task08(29, 2, 1800).trim().equalsIgnoreCase("Error.");

        int[] month30 = {2, 4, 6, 9, 11};

        for (int month : month30) {
            result = result && Task08.task08(31, month, 2020).trim().equalsIgnoreCase("Error.");
        }

        for (int month = 1; month <= 12; month++) {
            result = result && Task08.task08(-1, month, 2020).trim().equalsIgnoreCase("Error.");
            result = result && Task08.task08(0, month, 2020).trim().equalsIgnoreCase("Error.");
            result = result && Task08.task08(32, month, 2020).trim().equalsIgnoreCase("Error.");
        }

        result = result && Task08.task08(30, 1, 2023).trim().equalsIgnoreCase("31.01.2023")
                && Task08.task08(31, 1, 2023).trim().equalsIgnoreCase("01.02.2023")

                && Task08.task08(30, 3, 2023).trim().equalsIgnoreCase("31.03.2023")
                && Task08.task08(31, 3, 2023).trim().equalsIgnoreCase("01.04.2023")

                && Task08.task08(29, 4, 2023).trim().equalsIgnoreCase("30.04.2023")
                && Task08.task08(30, 4, 2023).trim().equalsIgnoreCase("01.05.2023")

                && Task08.task08(30, 5, 2023).trim().equalsIgnoreCase("31.05.2023")
                && Task08.task08(31, 5, 2023).trim().equalsIgnoreCase("01.06.2023")

                && Task08.task08(29, 6, 2023).trim().equalsIgnoreCase("30.06.2023")
                && Task08.task08(30, 6, 2023).trim().equalsIgnoreCase("01.07.2023")

                && Task08.task08(30, 7, 2023).trim().equalsIgnoreCase("31.07.2023")
                && Task08.task08(31, 7, 2023).trim().equalsIgnoreCase("01.08.2023")

                && Task08.task08(30, 8, 2023).trim().equalsIgnoreCase("31.08.2023")
                && Task08.task08(31, 8, 2023).trim().equalsIgnoreCase("01.09.2023")

                && Task08.task08(29, 9, 2023).trim().equalsIgnoreCase("30.09.2023")
                && Task08.task08(30, 9, 2023).trim().equalsIgnoreCase("01.10.2023")

                && Task08.task08(30, 10, 2023).trim().equalsIgnoreCase("31.10.2023")
                && Task08.task08(31, 10, 2023).trim().equalsIgnoreCase("01.11.2023")

                && Task08.task08(29, 11, 2023).trim().equalsIgnoreCase("30.11.2023")
                && Task08.task08(30, 11, 2023).trim().equalsIgnoreCase("01.12.2023")

                && Task08.task08(30, 12, 2023).trim().equalsIgnoreCase("31.12.2023")
                && Task08.task08(31, 12, 2023).trim().equalsIgnoreCase("01.01.2024");

        result = result && Task08.task08(28, 2, 1900).trim().equalsIgnoreCase("01.03.1900")
                && Task08.task08(28, 2, 2000).trim().equalsIgnoreCase("29.02.2000")
                && Task08.task08(29, 2, 2000).trim().equalsIgnoreCase("01.03.2000")
                && Task08.task08(28, 2, 1984).trim().equalsIgnoreCase("29.02.1984")
                && Task08.task08(29, 2, 1984).trim().equalsIgnoreCase("01.03.1984")
                && Task08.task08(29, 2, 0).trim().equalsIgnoreCase("01.03.0000")
                && Task08.task08(28, 2, 1).trim().equalsIgnoreCase("01.03.0001")
                && Task08.task08(28, 2, 4).trim().equalsIgnoreCase("29.02.0004")
                && Task08.task08(29, 2, 4).trim().equalsIgnoreCase("01.03.0004")
                && Task08.task08(28, 2, 10).trim().equalsIgnoreCase("01.03.0010")
                && Task08.task08(28, 2, 20).trim().equalsIgnoreCase("29.02.0020")
                && Task08.task08(29, 2, 20).trim().equalsIgnoreCase("01.03.0020")
                && Task08.task08(28, 2, 100).trim().equalsIgnoreCase("01.03.0100")
                && Task08.task08(28, 2, 200).trim().equalsIgnoreCase("01.03.0200")
                && Task08.task08(28, 2, 300).trim().equalsIgnoreCase("01.03.0300")
                && Task08.task08(28, 2, 400).trim().equalsIgnoreCase("29.02.0400")
                && Task08.task08(28, 2, 2100).trim().equalsIgnoreCase("01.03.2100")
                && Task08.task08(28, 2, 2200).trim().equalsIgnoreCase("01.03.2200")
                && Task08.task08(28, 2, 2300).trim().equalsIgnoreCase("01.03.2300")
                && Task08.task08(28, 2, 2400).trim().equalsIgnoreCase("29.02.2400")
                && Task08.task08(29, 2, 2400).trim().equalsIgnoreCase("01.03.2400");

        return String.format("Task 08 [Next Date] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask09() {
        boolean result = Task09.task09(1, 3, 2, 4).trim().equalsIgnoreCase("segment - [2, 3]")
                && Task09.task09(3, 1, 2, 4).trim().equalsIgnoreCase("segment - [2, 3]")
                && Task09.task09(1, 2, 2, 3).trim().equalsIgnoreCase("point - 2")
                && Task09.task09(1, 2, 3, 4).trim().equalsIgnoreCase("empty set")
                && Task09.task09(2, 2, 3, 4).trim().equalsIgnoreCase("error")

                && Task09.task09(0, 0, 0, 0).trim().equalsIgnoreCase("error")
                && Task09.task09(1, 1, 1, 1).trim().equalsIgnoreCase("error")
                && Task09.task09(-1, -1, -1, -1).trim().equalsIgnoreCase("error")
                && Task09.task09(3, 4, 2, 2).trim().equalsIgnoreCase("error")
                && Task09.task09(-2, -2, 3, 4).trim().equalsIgnoreCase("error")
                && Task09.task09(3, 4, -2, -2).trim().equalsIgnoreCase("error")

                && Task09.task09(-2, 4, 3, -1).trim().equalsIgnoreCase("segment - [-1, 3]")
                && Task09.task09(4, -2, 3, -1).trim().equalsIgnoreCase("segment - [-1, 3]")
                && Task09.task09(-2, 4, -1, 3).trim().equalsIgnoreCase("segment - [-1, 3]")
                && Task09.task09(3, -1, -2, 4).trim().equalsIgnoreCase("segment - [-1, 3]")
                && Task09.task09(3, -1, 4, -2).trim().equalsIgnoreCase("segment - [-1, 3]")

                && Task09.task09(1, 5, 6, 10).trim().equalsIgnoreCase("empty set")
                && Task09.task09(6, 10, 1, 5).trim().equalsIgnoreCase("empty set")
                && Task09.task09(5, 1, 6, 10).trim().equalsIgnoreCase("empty set")
                && Task09.task09(1, 5, 10, 6).trim().equalsIgnoreCase("empty set")

                && Task09.task09(1, 10, 3, 5).trim().equalsIgnoreCase("segment - [3, 5]")
                && Task09.task09(1, 5, 3, 7).trim().equalsIgnoreCase("segment - [3, 5]")
                && Task09.task09(3, 7, 1, 5).trim().equalsIgnoreCase("segment - [3, 5]")
                && Task09.task09(3, 5, 1, 10).trim().equalsIgnoreCase("segment - [3, 5]")

                && Task09.task09(1, 5, 1, 5).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task09.task09(5, 1, 1, 5).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task09.task09(1, 5, 5, 1).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task09.task09(5, 1, 5, 1).trim().equalsIgnoreCase("segment - [1, 5]")

                && Task09.task09(1, 10, 1, 5).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task09.task09(1, 5, 1, 10).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task09.task09(5, 10, 1, 10).trim().equalsIgnoreCase("segment - [5, 10]")
                && Task09.task09(1, 10, 5, 10).trim().equalsIgnoreCase("segment - [5, 10]")

                && Task09.task09(5, 1, 10, 1).trim().equalsIgnoreCase("segment - [1, 5]")
                && Task09.task09(10, 5, 10, 1).trim().equalsIgnoreCase("segment - [5, 10]")
                && Task09.task09(10, 1, 10, 5).trim().equalsIgnoreCase("segment - [5, 10]")

                && Task09.task09(1, 5, 5, 10).trim().equalsIgnoreCase("point - 5")
                && Task09.task09(1, 5, 10, 5).trim().equalsIgnoreCase("point - 5")
                && Task09.task09(5, 1, 10, 5).trim().equalsIgnoreCase("point - 5")
                && Task09.task09(5, 1, 5, 10).trim().equalsIgnoreCase("point - 5")

                && Task09.task09(5, 10, 1, 5).trim().equalsIgnoreCase("point - 5")
                && Task09.task09(5, 10, 5, 1).trim().equalsIgnoreCase("point - 5")
                && Task09.task09(10, 5, 1, 5).trim().equalsIgnoreCase("point - 5")
                && Task09.task09(10, 5, 5, 1).trim().equalsIgnoreCase("point - 5");

        return String.format("Task 09 [Intersection of Segments] %s", result ? RIGHT : WRONG);
    }

    public static String testingTask10() {
        boolean result = Task10.task10(10, 3, 2) == 8
                && Task10.task10(10, 2, 1) == 9
                && Task10.task10(10, 4, 2) == 4
                && Task10.task10(10, 5, 4) == 6
                && Task10.task10(10, 6, 5) == 5
                && Task10.task10(10, 7, 6) == 4
                && Task10.task10(10, 8, 7) == 3
                && Task10.task10(10, 9, 8) == 2
                && Task10.task10(10, 10, 9) == 1
                && Task10.task10(10, 6, 3) == 3
                && Task10.task10(10, 9, 3) == 2
                && Task10.task10(3, 2, 1) == 2
                && Task10.task10(100, 3, 2) == 98
                && Task10.task10(99, 100, 98) == 1
                && Task10.task10(4, 3, 2) == 2

                && Task10.task10(-4, 3, 2) == 0
                && Task10.task10(4, -3, 2) == 0
                && Task10.task10(4, 3, -2) == 0
                && Task10.task10(0, 3, 2) == 0
                && Task10.task10(4, 0, 2) == 0
                && Task10.task10(4, 3, 0) == 0
                && Task10.task10(4, 2, 3) == 0
                && Task10.task10(4, 3, 3) == 0
                && Task10.task10(2, 3, 2) == 0
                && Task10.task10(1, 3, 2) == 0;

        return String.format("Task 10 [Caterpillar] %s", result ? RIGHT : WRONG);
    }
}