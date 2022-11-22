public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork 6");
        System.out.println("\n Part 1");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n Part 2");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n Part 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n Part 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n Part 5");
        System.out.print("Високосные года: ");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.print(i + " ");
        }

        System.out.println("\n Part 6");
        for (int i = 7; i <= 98 ; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println("\n Part 7");
            for (int i = 0; i < 10 ; i++) {
            System.out.print((int)Math.pow(2,i) + " ");
        }

        System.out.println("\n Part 7 second version");
        for (int i = 1; i <= 512 ; i*=2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n Part 8.1");
        int amountMoney1 = 0;
        int increasePerMonth1 = 29000;
        for (int i = 1; i <=12 ; i++) {
            amountMoney1+= increasePerMonth1;
            System.out.println(i + " месяц, сумма накоплений: " + amountMoney1);
        }

        System.out.println("\n Part 8.2 bank percent");
        double amountMoney = 0;
        int increasePerMonth = 29000;
        double bankYearPercentAdd = 12;
        for (int i = 1; i <=12 ; i++) {
            amountMoney=amountMoney*((100+ bankYearPercentAdd)/100);
            amountMoney+= increasePerMonth;
            System.out.println(i + " месяц, сумма накоплений: " + (int)amountMoney);
        }
    }
}