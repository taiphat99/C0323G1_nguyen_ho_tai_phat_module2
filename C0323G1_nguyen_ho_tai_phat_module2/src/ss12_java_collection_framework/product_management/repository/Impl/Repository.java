package ss12_java_collection_framework.product_management.repository.Impl;

import ss12_java_collection_framework.product_management.model.Product;
import ss12_java_collection_framework.product_management.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository {

    static List<Product> productList = new ArrayList<>();

    static {
        Product product1 = new Product("1", "Iphone", 20000000f, 12, "Nhanh mượt mà");
        Product product2 = new Product("2", "SamSung", 18000000f, 5, "Camera zoom xa");
        Product product3 = new Product("3", "Bphone", 10000000f, 7, "Hàng Việt Nam, Chất lượng tạm");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public Product getById(String id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public void update(Product checkIdProduct) {
        for (Product product : productList) {
            if (product.getId().equals(checkIdProduct.getId())) {
                product.setName(checkIdProduct.getName());
                product.setPrice(checkIdProduct.getPrice());
                product.setQuantity(checkIdProduct.getQuantity());
                product.setDescription(checkIdProduct.getDescription());
            }
        }
    }

}
