package ss12_java_collection_framework.product_management.repository.impl;

import ss12_java_collection_framework.product_management.model.Product;
import ss12_java_collection_framework.product_management.repository.IProductRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static List<Product> productList = new ArrayList<>();

    static {
        Product product1 = new Product("1", "Iphone", 20000000f, 12, "Nhanh mượt mà");
        Product product2 = new Product("2", "SamSung", 18000000f, 5, "Camera zoom xa");
        Product product3 = new Product("3", "Bphone", 10000000f, 7, "Hàng Việt Nam, Chất lượng tạm");
        Product product4 = new Product("4", "Iphonge", 23000000f, 7, "Đẳng cấp");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
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
    public Product findById(String id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> searchingList = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                searchingList.add(p);
            }
        }
        if (searchingList.size() == 0) {
            return null;
        } else {
            return searchingList;
        }
    }

    @Override
    public void sortUp() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    @Override
    public void sortDown() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public void updateProduct(Product product) {
        for (Product p : productList) {
            if (p.getId().equals(product.getId())) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setQuantity(product.getQuantity());
                p.setDescription(product.getDescription());
            }
        }
    }

}
