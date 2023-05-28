package ss12_java_collection_framework.product_management.repository;

import ss12_java_collection_framework.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List getAll();

    void addProduct(Product product);

    void deleteProduct(Product product);

    Product checkIdProduct(String id);

    List <Product> searchByName(String name);

    void sortUp();

    void sortDown();
}
