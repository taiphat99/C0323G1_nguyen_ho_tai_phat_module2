package demo_exam.repository;

import demo_exam.model.Product;

import java.util.List;

public interface IProductRepository {
    Product findById(String id);

    String getInfo(Product product);

    void delete(Product product);

    void add(Product product);

    List<Product> getAll();
}
