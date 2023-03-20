package shop.t2208a1;

public enum Category {
    FOOD ("Thực phẩm"),
    HOUSEWARE("Đồ gia dụng"),
    COSMETICS("Mỹ phẩm"),
    FASHION("Tời trang")
    ;
    private String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
