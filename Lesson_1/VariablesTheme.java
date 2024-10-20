public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера\n");

        byte cores = 8;
        short ramSize = 16;
        int hddSize = 1000;
        long cpuFrequency = 3200L;
        float gpuMemory = 8.0f;
        double cpuTemperature = 65.5;
        boolean isGamingPC = true;

        System.out.println("Описание характеристик компьютера:");
        System.out.println("Количество ядер процессора: " + cores);
        System.out.println("Размер оперативной памяти: " + ramSize + " ГБ");
        System.out.println("Размер жесткого диска: " + hddSize + " ГБ");
        System.out.println("Частота процессора: " + cpuFrequency + " МГц");
        System.out.println("Объем видеопамяти: " + gpuMemory + " ГБ");
        System.out.println("Температура процессора: " + cpuTemperature + " °C");
        System.out.println("Игровой ПК: " + isGamingPC);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discountRate = 0.11;
        double totalPriceWithoutDiscount = penPrice + bookPrice;
        double discountAmount = totalPriceWithoutDiscount * discountRate;
        double totalPriceWithDiscount = totalPriceWithoutDiscount - discountAmount;

        System.out.println("Стоимость товаров без скидки: " + totalPriceWithoutDiscount + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Стоимость товаров со скидкой: " + totalPriceWithDiscount + " руб.");

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte byteValue = Byte.MAX_VALUE;
        short shortValue = Short.MAX_VALUE;
        int intValue = Integer.MAX_VALUE;
        long longValue = Long.MAX_VALUE;

        System.out.println("byte:");
        System.out.println("Первоначальное значение: " + byteValue);
        System.out.println("После инкремента: " + (byteValue + 1));
        System.out.println("После декремента: " + (byteValue - 1));
        System.out.println();

        System.out.println("short:");
        System.out.println("Первоначальное значение: " + shortValue);
        System.out.println("После инкремента: " + (shortValue + 1));
        System.out.println("После декремента: " + (shortValue - 1));
        System.out.println();

        System.out.println("int:");
        System.out.println("Первоначальное значение: " + intValue);
        System.out.println("После инкремента: " + (intValue + 1));
        System.out.println("После декремента: " + (intValue - 1));
        System.out.println();

        System.out.println("long:");
        System.out.println("Первоначальное значение: " + longValue);
        System.out.println("После инкремента: " + (longValue + 1));
        System.out.println("После декремента: " + (longValue - 1));

        System.out.println("\n5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;

        System.out.println("Исходные значения переменных:\na: " + a + ", b: " + b + "\n");

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Способ 1: с помощью третьей переменной" +
                "\nНовые значения переменных:\na: " + a + ", b: " + b + "\n");

        a = 2;
        b = 5;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Способ 2: с помощью арифметических операций" +
                "\nНовые значения переменных:\na: " + a + ", b: " + b + "\n");

        a = 2;
        b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Способ 3: с помощью побитовой операции " +
                "^\nНовые значения переменных:\na: " + a + ", b: " + b);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char symbol1 = '$';
        char symbol2 = '*';
        char symbol3 = '@';
        char symbol4 = '|';
        char symbol5 = '~';

        System.out.println((int) symbol1 + " " + symbol1);
        System.out.println((int) symbol2 + " " + symbol2);
        System.out.println((int) symbol3 + " " + symbol3);
        System.out.println((int) symbol4 + " " + symbol4);
        System.out.println((int) symbol5 + " " + symbol5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n\n");

        char slash = '/';
        char backslash = '\\';
        char space = ' ';
        char underscore = '_';
        char parenthesesLeft = '(';
        char parenthesesRight = ')';

        System.out.println("    " + slash + backslash + "\n" +
                "   " + slash + space + space + backslash + "\n" +
                "  " + slash + underscore + parenthesesLeft + space + parenthesesRight + backslash + "\n" +
                " " + slash + space + space + space + space + space + space + backslash + "\n" +
                slash + underscore + underscore + underscore + underscore + backslash + slash + underscore +
                underscore + backslash
        );

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа\n");

        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;

        System.out.printf("Число %d содержит:%n", number);
        System.out.printf("  сотен - %d%n", hundreds);
        System.out.printf("  десятков - %d%n", tens);
        System.out.printf("  единиц - %d%n", units);
        System.out.printf("Сумма разрядов = %d%n", sum);
        System.out.printf("Произведение разрядов = %d%n", product);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды\n");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}