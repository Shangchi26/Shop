package shop.t2208a1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("DANH SÁCH SẢN PHẨM: ");
                repository.show();
                break;
            case 2:
                System.out.println("CÁC SẢN PHẨM CÓ GIÁ TRÊN 10000: ");
                repository.filterProductByPrice();
                break;
            case 3:
                repository.countProductByAmountSale();
                break;
            case 7:
                repository.sortProductByName();
                System.out.println("SẢN PHẨM SAU KHI SẮP XẾP: ");
                repository.show();
        }
    }
}
