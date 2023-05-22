package ss12_java_collection_framework.product_management.repository;

import ss12_java_collection_framework.product_management.model.Product;

import java.util.List;

public interface IRepository {
    List getAll();

    void addProduct(Product product);

    void deleteProduct(Product product);

    Product getById(String id);
}
