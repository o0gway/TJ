public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("\n\t\tЗадачки на тему");
        System.out.println("\t\"Переменные: примитивные типы данных”");
        // Вывод значений переменных на консоль
        System.out.println("\n1. Вывод значений переменных на консоль");
        byte numCpu = 1;
        short numCores = 12;
        int sizeRam = 16_271_176;
        long sizeSsd = 220_554_056L;
        float frequencyCpu = 2.4F;
        double sizeHdd = 1_441_013_740;
        char seriesLaptop = 'A';
        boolean isLinux = true;
        System.out.println("Количество процессоров у компьютера: " + numCpu);
        System.out.println("Количество ядер у компьютера: " + numCores);
        System.out.println("Размер оперативной памяти у компьютера: " + sizeRam);
        System.out.println("Объём SSD у компьютера: " + sizeSsd);
        System.out.println("Частота процессора у компьютера: " + frequencyCpu);
        System.out.println("Объём HDD у компьютера: " + sizeHdd);
        System.out.println("Серия компьютера: " + seriesLaptop);
        System.out.println("Операционная система Linux?: " + isLinux);

        // Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int totalDiscount = (penPrice + bookPrice) / 100 * discount;
        System.out.println("Общая сумма скидки: " + totalDiscount);
        int totalPriceWithDiscount = penPrice + bookPrice - totalDiscount;
        System.out.println("Общая стоимость товаров со скидкой: " + totalPriceWithDiscount);

        // Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("""
                   J    a  v     v  a                                                  
                   J   a a  v   v  a a                                                 
                J  J  aaaaa  V V  aaaaa                                                
                 JJ  a     a  V  a     a
                """);

        // Вывод min и max значений целых числовых типов
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807L;
        System.out.println("***Byte***\nПервоначальное значение: " + numByte);
        System.out.println("Значение после инкремента: " + ++numByte);
        System.out.println("Значение после декремента: " + --numByte);
        System.out.println("***Short***\nПервоначальное значение: " + numShort);
        System.out.println("Значение после инкремента: " + ++numShort);
        System.out.println("Значение после декремента: " + --numShort);
        System.out.println("***Int***\nПервоначальное значение: " + numInt);
        System.out.println("Значение после инкремента: " + ++numInt);
        System.out.println("Значение после декремента: " + --numInt);
        System.out.println("***Long***\nПервоначальное значение: " + numLong);
        System.out.println("Значение после инкремента: " + ++numLong);
        System.out.println("Значение после декремента: " + --numLong);

        // Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("***С помощью третьей переменной***");
        int firstNum = 2;
        int secondNum = 5;
        int heapNum;
        System.out.println("Исходное значение первой переменной: " + firstNum);
        System.out.println("Исходное значение второй переменной: " + secondNum);
        heapNum = firstNum;
        firstNum = secondNum;
        secondNum = heapNum;
        System.out.println("Значение первой переменной после: " + firstNum);
        System.out.println("Значение второй переменной после: " + secondNum);
        System.out.println("***С помощью арифметических операций***");
        System.out.println("Исходное значение первой переменной: " + firstNum);
        System.out.println("Исходное значение второй переменной: " + secondNum);
        firstNum += secondNum;
        secondNum = firstNum - secondNum;
        firstNum -= secondNum;
        System.out.println("Значение первой переменной после: " + firstNum);
        System.out.println("Значение второй переменной после: " + secondNum);
        System.out.println("***С помощью побитовой операции ^***");
        System.out.println("Исходное значение первой переменной: " + firstNum);
        System.out.println("Исходное значение второй переменной: " + secondNum);
        firstNum ^= secondNum;
        secondNum ^= firstNum;
        firstNum ^= secondNum;
        System.out.println("Значение первой переменной после: " + firstNum);
        System.out.println("Значение второй переменной после: " + secondNum);

        // Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        // 35, 38, 64, 94, 95
        char sym1 = '#';
        char sym2 = '&';
        char sym3 = '@';
        char sym4 = '^';
        char symUndersore = '_';
        System.out.println("Код символа\tСимвол из ASCII-таблицы");
        System.out.printf("%s\t\t%s\n", (int) sym1, sym1);
        System.out.printf("%s\t\t%s\n", (int) sym2, sym2);
        System.out.printf("%s\t\t%s\n", (int) sym3, sym3);
        System.out.printf("%s\t\t%s\n", (int) sym4, sym4);
        System.out.printf("%s\t\t%s\n", (int) symUndersore, symUndersore);

        //Вывод количества сотен, десятков и единиц числа
        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        numInt = 987;
        System.out.printf("Число %s содержит:\n", numInt);
        System.out.printf("%d сотен\n", numInt / 100 % 10);
        System.out.printf("%d десятков\n", numInt / 10 % 10);
        System.out.printf("%d единиц\n", numInt % 10);

        // Вывод в консоль ASCII-арт Дюка
        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char roundBracketLeft = '(';
        char roundBracketRight = ')';
        System.out.printf("    %s%s\n", slash, backSlash);
        System.out.printf("   %s  %s\n", slash, backSlash);
        System.out.printf("  %s%s%s %s%s\n", slash, symUndersore, roundBracketLeft, roundBracketRight, backSlash);
        System.out.printf(" %s      %s\n", slash, backSlash);
        System.out.printf("%s%s%s%s%s%s%s%s%s%s\n", slash, 
                symUndersore, symUndersore, symUndersore, symUndersore,
                slash, backSlash,
                symUndersore, symUndersore, backSlash);

        // Вывод произведения и суммы цифр числа
        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        numInt = 345;
        int numUnit = numInt % 10;
        int numDecimal = numInt / 10 % 10;
        int numOneHundred = numInt / 100 % 10;
        System.out.printf("Сумма цифр числа %d = %d\n", numInt, (numUnit + numDecimal + numOneHundred));
        System.out.printf("Произведение цифр числа %d = %d\n", numInt, (numUnit * numDecimal * numOneHundred));

        // Вывод времени
        System.out.println("\n10. Вывод времени");
        int totalSeconds = 86399;
        int watchSecond = 86399 % 60;
        int watchMinute = (86399 / 60) % 60;
        int watchHour = 86399 / 3600;
        System.out.printf("%d:%d:%d\n", watchHour, watchMinute, watchSecond);

    }
}