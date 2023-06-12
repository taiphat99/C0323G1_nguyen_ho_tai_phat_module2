package demo_exam.repository.impl;

import demo_exam.common.ManipulateFile;
import demo_exam.model.Product;
import demo_exam.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private List<Product> productList = new ArrayList<>();
    private final String PRODUCT_PATH = "src/demo_exam/data/Product.csv";

    public List<Product> getAll() {
        List<String> stringList = ManipulateFile.readFromFile(PRODUCT_PATH);
        productList.clear();
        for (String s : stringList) {
            String[] arr = s.split(",");
            productList.add(new Product(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]));
        }
        return productList;
    }
    public void add(Product product){
        List<String> stringList = new ArrayList<>();
        stringList.add(getInfo(product));
        ManipulateFile.writeToFile(PRODUCT_PATH,stringList,true);
    }
    public void delete(Product product){
        List<String> stringList = new ArrayList<>();
        productList = getAll();
        productList.remove(product);
        for (Product p: productList) {
            stringList.add(getInfo(p));
        }
        ManipulateFile.writeToFile(PRODUCT_PATH,stringList,false);
    }
    public Product findById(String id ){
        productList = getAll();
        for (Product p : productList) {
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public String getInfo(Product product) {
        return product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getQuantity() + "," + product.getExpiredDate();
    }
}
