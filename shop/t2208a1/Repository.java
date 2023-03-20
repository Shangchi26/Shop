package shop.t2208a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Repository {

    List<Product> listProducts = new ArrayList<>();

    public Repository() {
        listProducts.add(new Product("01", "Bánh Doraemon 3 vị", Category.FOOD, 100, 3500, 57));
        listProducts.add(new Product("02", "Xúc xích sườn non", Category.FOOD, 150, 3500, 12));
        listProducts.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProducts.add(new Product("04", "Bánh khoai môn", Category.FOOD, 200, 42000, 78));
        listProducts.add(new Product("05", "Thìa ăn cơm inox mạ vàng", Category.HOUSEWARE, 65, 4000, 44));
        listProducts.add(new Product("06", "Bát đựng gia vị", Category.HOUSEWARE, 65, 4000, 44));
        listProducts.add(new Product("07", "Nước hoa hồng", Category.COSMETICS, 140, 92000, 88));
        listProducts.add(new Product("08", "Combo gội xả CLEAR", Category.COSMETICS, 100, 639000, 7));
        listProducts.add(new Product("09", "Tinh chất dưỡng ẩm sâu", Category.COSMETICS, 50, 249000, 24));
        listProducts.add(new Product("10", "Kem dưỡng thể", Category.COSMETICS, 80, 715000, 63));
        listProducts.add(new Product("11", "Áo thun TSUN", Category.FASHION, 250, 320000, 146));
    }

    public void show() {
        listProducts.forEach(product -> System.out.println(product));
    }

    public void sortProductByName() {
        listProducts.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void filterProductByPrice() {
        listProducts.stream()
                .filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSale() {
        long count = listProducts.stream()
                .filter(product -> product.getAmountSale() >= 50)
                .count();

        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là: " + count);
    }
}
