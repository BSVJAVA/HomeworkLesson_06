public class Main {
    public static void main(String[] args) {
        // Задача №1
        int total = 0;
        int numberOfMonths = 0;
        while (total < 2_459_000) {
            numberOfMonths++;
            total = total + 15000;
        }
        System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + total + " рублей");

        // Задача №2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача №3
        int population = 12_000_000;  // человек. Текущее население страны
        int years = 10;               // Количество лет для расчёта изменения численности населения
        int birthRate = 17;           // Рождаемость в чел/год на 1000 населения
        int mortalityRate = 8;        // Смертность в чел/год на 1000 населения
        int populationChange = (population / 1000) * (birthRate - mortalityRate); // Изменение населения за год
        for (int j = 1; j <= years; j++) {        // Счётчик лет
            population = population + populationChange;
            System.out.println("Год " + j + ", численность населения составляет " + population);
        }

        // Задача №4
        int monthlyRate = 7;                // Процентная ставка в месяц
        int initialContribution = 15_000;   // Начальный вклад в рублях
        int accumulatedAmount = 12_000_000; // Сумма в рублях которую необходимо накопить
        numberOfMonths = 0;                 // Счётчик месяцев
        while (initialContribution <= accumulatedAmount) {
            numberOfMonths++;
            initialContribution = initialContribution + initialContribution * monthlyRate / 100;
            System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + initialContribution + " рублей");
        }

        // Задача №5
        monthlyRate = 7;                // Процентная ставка в месяц
        initialContribution = 15_000;   // Начальный вклад в рублях
        accumulatedAmount = 12_000_000; // Сумма в рублях которую необходимо накопить
        numberOfMonths = 0;                 // Счётчик месяцев
        while (initialContribution <= accumulatedAmount) {
            numberOfMonths++;
            initialContribution = initialContribution + initialContribution * monthlyRate / 100;
            if (numberOfMonths % 6 == 0) {
                System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + initialContribution + " рублей");
            }
        }

        // Задача №6
        monthlyRate = 7;                // Процентная ставка в месяц
        initialContribution = 15_000;   // Начальный вклад в рублях
        int yearsOfSavings = 9;         // Количество лет в течении которых будут копиться деньги
        for (numberOfMonths = 1; numberOfMonths <= yearsOfSavings * 12; numberOfMonths++) {  // Счётчик месяцев
            initialContribution = initialContribution + initialContribution * monthlyRate / 100;
            if (numberOfMonths % 6 == 0) {
                System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + initialContribution + " рублей");
            }
        }

        // Задача №7
        int firstFriday = 4;                          // 1...7, дата первой пятницы месяца
        for (i = firstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        // Задача №8
        int currentYear = 2025;
        int initialYear = currentYear - 200;
        int finalYear = currentYear + 100;
        for (int j = initialYear; j <= finalYear; j++) {
            if (j % 79 == 0) {
                System.out.println(j);
            }
        }
    }
}