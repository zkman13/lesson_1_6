public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        boolean isMale = true;
        int age = 20;
        double height = 1.75;

        if (!isMale) {
            System.out.println("Gender: Female");
        } else {
            System.out.println("Gender: Male");
        }

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        if (height < 1.8) {
            System.out.println("Height is less than 1.8 meters");
        } else {
            System.out.println("Height is 1.8 meters or more");
        }

        String name = "Ivan";
        char firstNameLetter = name.charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("The name starts with M");
        } else if (firstNameLetter == 'I') {
            System.out.println("The name starts with I");
        } else {
            System.out.println("The name starts with a different letter");
        }

        System.out.println("\n2. Поиск большего числа\n");

        int num1 = 123;
        int num2 = 223;

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are equal");
        }

        System.out.println("\n3. Проверка числа\n");

        int number = -10;

        if (number == 0) {
            System.out.println("Число равно нулю.");
            // Переход сразу к задаче 4
        } else {
            if (number > 0) {
                System.out.print(number + " является положительным");
            } else {
                System.out.print(number + " является отрицательным");
            }

            if (number % 2 == 0) {
                System.out.println(" и четным.");
            } else {
                System.out.println(" и нечетным.");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int firstDigit1 = num1 / 100;
        int secondDigit1 = (num1 / 10) % 10;
        int thirdDigit1 = num1 % 10;

        int firstDigit2 = num2 / 100;
        int secondDigit2 = (num2 / 10) % 10;
        int thirdDigit2 = num2 % 10;

        boolean hasEqualDigits = false;

        if (firstDigit1 == firstDigit2 && secondDigit1 == secondDigit2 && thirdDigit1 == thirdDigit2) {
            System.out.println("Все цифры в числах " + num1 + " и " + num2 + " одинаковы.");
        } else {
            if (firstDigit1 != firstDigit2 && secondDigit1 != secondDigit2 && thirdDigit1 != thirdDigit2) {
                System.out.println("Равных цифр в разрядах чисел " + num1 + " и " + num2 + " нет.");
            } else {
                System.out.println("Числа: " + num1 + " и " + num2);

                if (firstDigit1 == firstDigit2) {
                    hasEqualDigits = true;
                    System.out.println("Цифры " + firstDigit1 + " в первом разряде одинаковы.");
                }

                if (secondDigit1 == secondDigit2) {
                    hasEqualDigits = true;
                    System.out.println("Цифры " + secondDigit1 + " во втором разряде одинаковы.");
                }

                if (thirdDigit1 == thirdDigit2) {
                    hasEqualDigits = true;
                    System.out.println("Цифры " + thirdDigit1 + " в третьем разряде одинаковы.");
                }

                if (!hasEqualDigits) {
                    System.out.println("Равных цифр в разрядах чисел " + num1 + " и " + num2 + " нет.");
                }
            }
        }

        System.out.println("\n5. Определение символа по его коду\n");

        char character = '\u0057';

        if (Character.isLetter(character)) {
            if (Character.isUpperCase(character)) {
                System.out.println("'" + character + "' - большая буква");
            } else {
                System.out.println("'" + character + "' - маленькая буква");
            }
        } else if (Character.isDigit(character)) {
            System.out.println("'" + character + "' - цифра");
        } else {
            System.out.println("'" + character + "' - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %\n");

        double deposit = 321123.59;
        double interestRate;
        double interest;

        if (deposit < 100000) {
            interestRate = 0.05;
        } else if (deposit <= 300000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.10;
        }

        interest = deposit * interestRate;
        double totalAmount = deposit + interest;

        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Сумма начисленного %: " + interest + " руб.");
        System.out.println("Итоговая сумма с %: " + totalAmount + " руб.");

        System.out.println("\n7. Определение оценки по предметам\n");

        double historyPercentage = 59.0;
        double programmingPercentage = 92.0;

        int historyGrade;
        int programmingGrade;

        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        if (programmingPercentage <= 60) {
            programmingGrade = 2;
        } else if (programmingPercentage <= 73) {
            programmingGrade = 3;
        } else if (programmingPercentage <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercentage = (historyPercentage + programmingPercentage) / 2.0;

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл оценок: " + averageGrade);
        System.out.println("Средний % по предметам: " + averagePercentage);

        System.out.println("\n8. Расчет годовой прибыли\n");

        double monthlySales = 13025.233;
        double monthlyRent = 5123.018;
        double monthlyCost = 9001.729;

        double monthlyProfit = monthlySales - (monthlyRent + monthlyCost);
        double annualProfit = monthlyProfit * 12;

        String formattedProfit = String.format("%f", annualProfit);
        String sign = "";

        if (annualProfit > 0) {
            sign = "+";
        }

        System.out.println("Прибыль за год: " + sign + formattedProfit + " руб.");
    }
}