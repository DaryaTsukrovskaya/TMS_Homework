package by.teachmeskills.homework.hw_10032023.shop;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
