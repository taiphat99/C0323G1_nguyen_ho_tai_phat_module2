package ss17_io_binary_file_and_serialization.exercise.exercise_1.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String id;
    private String name;
    private float price;
    private String producer;
    private String description;

    public Product(String id, String name, float price, String producer, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
                ", Nhà sản xuất: " + producer +
                ", Mô tả: " + '"'+ description + '"';
    }
}