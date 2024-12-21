public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int totalSavings = 0;
        int monthlySavings = 15000;
        int target = 2459000;
        int month = 0;
        while (totalSavings < target) {
            month++;
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println("Task 2");
        int check = 0;
        int one = 1;
        int maхimum = 10;
        while (check < maхimum) {
            check = check + one;
            System.out.print(" " + check);
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i);
        }


        System.out.println("Task 3");
        int population = 12000000;
        float birthRate = 17.0f / 1000f;
        float deathRate = 8.0f / 1000f;
        int years = 2034;
        for (int year = 2024; year <= years; year++) {
            int births = (int) (population * birthRate);
            int deaths = (int) (population * deathRate);
            population = population + births - deaths;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Task 4");
        int contribution = 15000;
        int money = 0;
        int totaly = 12_000_000;
        int months = 0;
        while (money <= totaly) {
            months++;
            contribution = contribution + (contribution / 100) * 7;
            money = money + contribution;

            System.out.println(months + " месяц, сумма накоплений равна: " + money + " рублей.");

        }
        System.out.println(months + " Месяцев нужно, для того что бы накопить.");

        System.out.println("Task 5");
        int contributionTwo = 15000;
        int moneyTwo = 0;
        int totalyTwo = 12_000_000;
        int monthsTwo = 0;
        while (moneyTwo <= totalyTwo) {
            monthsTwo++;
            contributionTwo = contributionTwo + (contributionTwo / 100) * 7;
            moneyTwo = moneyTwo + contributionTwo;
            if (monthsTwo % 6 == 0)
                System.out.println(monthsTwo + " месяц, сумма накоплений равна: " + moneyTwo + " рублей.");

        }
        System.out.println("Task 6");
        int contributionThree = 15000;
        int moneyThree = 0;
        int monthsThree = 0;
        while (monthsThree <= 108) {
            monthsThree++;
            contributionThree = contributionThree + (contributionThree / 100) * 7;
            moneyThree = moneyThree + contributionThree;
            if (monthsThree % 6 == 0)
                System.out.println(monthsThree + " месяц, сумма накоплений равна: " + moneyThree + " рублей.");

        }
        System.out.println("Task 7");
        int day = 5;
        int inAMonth = 31;
        while (day <= inAMonth) {
            day++;
            if (day % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }


        }
        System.out.println("Task 8");
        int year = 1824;
        int lastYear = 2124;
        while (year <= lastYear) {
            year++;
            if (year % 79 == 0) {
                System.out.println(year);
            }


        }


    }

}


