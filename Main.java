import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во");
        int count = scanner.nextInt();
        System.out.println("Цена в lis");
        double price = scanner.nextDouble();
        System.out.println("Цена в Steam");
        double steam_Price = scanner.nextDouble();
        double summa = calcu(count, price, steam_Price);
        System.out.println("Итого:" + summa);

    }
    public static int calcu(int count, double price, double steam_price) {
        double tax = steam_price / 100;
        double tax2 = tax * 13;
        double price2 = steam_price - tax2;
        return (int) (price2 * count);
    }
}

