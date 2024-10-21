public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");

        final int minNumber = -10;
        final int maxNumber = 21;

        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        int currentNumber = minNumber;

        do {
            boolean isEven = currentNumber % 2 == 0;

            if (isEven) {
                evenNumbersSum += currentNumber;
            } else {
                oddNumbersSum += currentNumber;
            }

            currentNumber++;
        } while (currentNumber <= maxNumber);

        System.out.println("В отрезке [" + minNumber + ", " + maxNumber + "] сумма четных чисел = " +
                evenNumbersSum + ", а нечетных = " + oddNumbersSum);

        System.out.println("\n2. Подсчет суммы четных и нечетных чисел\n");

        int a = 10;
        int b = 5;
        int c = -1;
        int min = a;
        int max = a;

        if (b < min) {
            min = b;
        }

        if (b > max) {
            max = b;
        }

        if (c < min) {
            min = c;
        }

        if (c > max) {
            max = c;
        }

        System.out.print("Числа в интервале [" + min + ", " + max + "]: ");

        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");

        int number = 1234;
        int sum = 0;

        System.out.print("Реверсивное число: ");
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sum += digit;
            number /= 10;
        }

        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        int minNumber3 = 1;
        int maxNumber3 = 24;
        int count = 0;

        for (int i = minNumber3; i < maxNumber3; i++) {
            boolean isOdd = i % 2 != 0;

            if (isOdd) {
                count++;
                System.out.printf("%2d ", i);
            }

            if (count % 5 == 0) {
                System.out.println();
            }
        }

        int missing = (5 - (count % 5)) % 5;

        for (int i = 0; i < missing; i++) {
            System.out.printf("%2d ", 0);
        }

        if (count > 0) {
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");

        int anotherNumber = 3242592;
        int anotherCount = 0;

        while (anotherNumber > 0) {
            if (anotherNumber % 10 == 2) {
                anotherCount++;
            }
            anotherNumber /= 10;
        }

        String parity;
        if (anotherCount % 2 == 0) {
            parity = "четное";
        } else {
            parity = "нечетное";
        }

        System.out.printf("В 3242592 %s (%d) количество двоек%n", parity, anotherCount);

        System.out.println("\n6. Вывод геометрических фигур\n");

        final int rectangleWidth = 10;
        final int rectangleHeight = 5;

        for (int i = 0; i < rectangleHeight; i++) {
            for (int j = 0; j < rectangleWidth; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        int lineWidth = 5;
        int lineWidthCounter = lineWidth;
        int lineCounter = 0;

        while (lineCounter < lineWidth && lineWidthCounter > 0) {
            System.out.print("#");

            lineWidthCounter--;

            if (lineWidthCounter == 0) {
                lineWidth--;
                lineWidthCounter = lineWidth;
                System.out.println();
            }
        }

        System.out.println();

        final String isoscelesTriangleSymbol = "$";

        int isoscelesTriangleWidth = 1;
        int isoscelesTriangleHeight = 5;
        int triangleLineCounter = 0;
        boolean isIncreasing = true;

        do {
            do {
                System.out.print(isoscelesTriangleSymbol);
                triangleLineCounter++;
            } while (triangleLineCounter < isoscelesTriangleWidth);

            isoscelesTriangleHeight--;
            triangleLineCounter = 0;

            if (isIncreasing) {
                isoscelesTriangleWidth++;
            } else {
                isoscelesTriangleWidth--;
            }

            if (isoscelesTriangleWidth == 3) {
                isIncreasing = false;
            }

            System.out.println();
        } while (isoscelesTriangleHeight > 0);

        System.out.println("\n7. Вывод ASCII-символов\n");

        System.out.printf("%-10s %-10s %-20s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int code = 33; code <= 45; code += 2) {
            char character = (char) code;
            String description = Character.getName(character);

            System.out.printf("%-10d %-10c %-20s%n", code, character, description);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int initialNumber = 1234321;
        int originalNumber = initialNumber;
        int reversedNumber = 0;

        while (initialNumber > 0) {
            int lastDigit = initialNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            initialNumber /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.printf("%d является палиндромом%n", originalNumber);
        } else {
            System.out.printf("%d не является палиндромом%n", originalNumber);
        }

        System.out.println("\n9. Проверка, является ли число счастливым\n");

        int sixDigitNumber = 123321;
        int firstHalf = sixDigitNumber / 1000;
        int secondHalf = sixDigitNumber % 1000;

        int sumFirstHalf = 0;
        int temp = firstHalf;

        while (temp > 0) {
            sumFirstHalf += temp % 10;
            temp /= 10;
        }

        int sumSecondHalf = 0;
        temp = secondHalf;

        while (temp > 0) {
            sumSecondHalf += temp % 10;
            temp /= 10;
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.printf("Число %d - счастливое%n", sixDigitNumber);
        } else {
            System.out.printf("Число %d - не является счастливым%n", sixDigitNumber);
        }

        System.out.printf("Сумма цифр %d = %d%n", firstHalf, sumFirstHalf);
        System.out.printf("Сумма %d = %d%n", secondHalf, sumSecondHalf);

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        int size = 9;

        System.out.print("    |");

        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.println("----+-----------------------------------");

        for (int i = 1; i <= size; i++) {
            System.out.printf("%3d |", i);

            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }
}
