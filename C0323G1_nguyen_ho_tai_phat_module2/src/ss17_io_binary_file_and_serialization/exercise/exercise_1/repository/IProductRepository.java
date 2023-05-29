package ss17_io_binary_file_and_serialization.exercise.exercise_1.repository;

import ss17_io_binary_file_and_serialization.exercise.exercise_1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void addProduct(Product product);

    void deleteProduct(Product product);

    Product checkIdProduct(String id);

    List<Product> searchByName(String name);
}
