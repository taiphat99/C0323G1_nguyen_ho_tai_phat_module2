package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("P-001", "Chocolate", 40000, 25, "Bánh siêu ngon"));
        products.add(new Product("P-002", "Chinsu", 15000, 100, "Mắm hơi mặn"));
    }


    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product getByCode(String code) {
        for(Product product: products) {
            if(product.getCodeProduct().equals(code)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }
}
