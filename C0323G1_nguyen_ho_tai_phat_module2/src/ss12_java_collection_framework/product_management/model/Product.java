package ss12_java_collection_framework.product_management.model;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private float price;
    private int quantity;
    private String description;

    public Product(String id, String name, float price, int quantity, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Thông tin sản phẩm " +
                "ID: " + id +
                ", Tên: " + name +
                ", Giá: " + price +
                ", Số lượng: " + quantity +
                ", Mô tả: " + '"' + description + '"';
    }

    public String getInfo() {
        return getId() + "," + getName() + "," + getPrice() + "," + getQuantity() + "," + getDescription();
    }
}
