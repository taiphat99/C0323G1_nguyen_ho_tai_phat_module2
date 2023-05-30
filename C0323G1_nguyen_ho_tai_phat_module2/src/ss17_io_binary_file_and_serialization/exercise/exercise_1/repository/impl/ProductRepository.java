package ss17_io_binary_file_and_serialization.exercise.exercise_1.repository.impl;

import ss17_io_binary_file_and_serialization.exercise.exercise_1.data.ManipulateFile;
import ss17_io_binary_file_and_serialization.exercise.exercise_1.model.Product;
import ss17_io_binary_file_and_serialization.exercise.exercise_1.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static ManipulateFile manipulateFile = new ManipulateFile();
    private static List<Product> productList = new ArrayList<>();
    @Override
    public List<Product> getAll() {
        productList = manipulateFile.readFromFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_1/data/product.dat");
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList = manipulateFile.readFromFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_1/data/product.dat");
        productList.add(product);
        manipulateFile.writeToFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_1/data/product.dat",productList);
    }

    @Override
    public void deleteProduct(Product product) {
        productList = manipulateFile.readFromFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_1/data/product.dat");
        productList.remove(product);
        manipulateFile.writeToFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_1/data/product.dat",productList);
    }

    @Override
    public Product checkIdProduct(String id) {
        productList.clear();
        productList = manipulateFile.readFromFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_1/data/product.dat");
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> searchByName(String name) {
        productList.clear();
        productList = manipulateFile.readFromFile("src/ss17_io_binary_file_and_serialization/exercise/exercise_1/data/product.dat");
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
}
