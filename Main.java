import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во");
        int count = scanner.nextInt();
        System.out.println("Цена в lis");
        int price = scanner.nextInt();
        System.out.println("Цена в Steam");
        int steam_Price = scanner.nextInt();
        int summa = calcu(count, price, steam_Price);
        System.out.println("Итого:" + summa);

    }
    public static int calcu(int count, int price, int steam_price) {
        int tax = steam_price / 100;
        int tax2 = tax * 13;
        int price2 = price - tax2;
        return price2 * count;






    }
}


