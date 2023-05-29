package ss17_io_binary_file_and_serialization.exercise.exercise_1.service.impl;

import ss17_io_binary_file_and_serialization.exercise.exercise_1.model.Product;
import ss17_io_binary_file_and_serialization.exercise.exercise_1.repository.impl.ProductRepository;
import ss17_io_binary_file_and_serialization.exercise.exercise_1.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private ProductRepository repository = new ProductRepository();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.print("Vui lòng nhập ID sản phẩm mới: ");
        String id = sc.nextLine();
        Product checkIdProduct = repository.checkIdProduct(id);
        if (checkIdProduct == null) {
            System.out.print("Vui lòng nhập tên sản phẩm mới: ");
            String name = sc.nextLine();
            System.out.print("Vui lòng nhập giá sản phẩm mới: ");
            float price = Float.parseFloat(sc.nextLine());
            System.out.print("Vui lòng nhập nhà sản xuất: ");
            String producer = sc.nextLine();
            System.out.print("Vui lòng nhập thêm mô tả sản phẩm mới: ");
            String description = sc.nextLine();
            Product addedProduct = new Product(id, name, price, producer, description);
            repository.addProduct(addedProduct);
            System.out.print("Thêm thành công! ");
        } else {
            System.out.print("ID này đã tồn tại! \n");
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Vui lòng nhập ID của sản phẩm muốn xoá: ");
        String id = sc.nextLine();
        Product checkId = repository.checkIdProduct(id);
        if (checkId == null) {
            System.out.println("Không tìm thấy sản phẩm có ID: " + id);
        } else {
            System.out.println("Bạn có chắc muốn xoá sản phẩm này không? \n" +
                    "1. Có \n" +
                    "2. Không");
            int confirmOption = Integer.parseInt(sc.nextLine());
            if(confirmOption == 1){
                repository.deleteProduct(checkId);
                System.out.println("Xoá thành công! ");
            } else {
                System.out.println("Cảm ơn lòng bao dung của bạn vì đã không xoá sản phẩm =))");
            }
        }
    }
    @Override
    public void displayProduct() {
        List<Product> productList = repository.getAll();
        for (Product product : productList) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("Vui lòng nhập tên sản phẩm bạn muốn tìm: ");
        String findingName = sc.nextLine();
        List<Product> newList = repository.searchByName(findingName);
        for (Product p:newList) {
            System.out.println(p);
        }
    }
}
