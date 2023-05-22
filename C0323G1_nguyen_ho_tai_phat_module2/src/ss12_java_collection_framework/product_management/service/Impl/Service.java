package ss12_java_collection_framework.product_management.service.Impl;

import ss12_java_collection_framework.product_management.model.Product;
import ss12_java_collection_framework.product_management.repository.Impl.Repository;
import ss12_java_collection_framework.product_management.service.IService;

import java.util.List;
import java.util.Scanner;


public class Service implements IService {
    private Repository repository = new Repository();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.print("Vui lòng nhập ID sản phẩm mới: ");
        String id = sc.nextLine();
        Product checkIdProduct = repository.getById(id);
        if (checkIdProduct == null) {
            System.out.print("Vui lòng nhập tên sản phẩm mới: ");
            String name = sc.nextLine();
            System.out.print("Vui lòng nhập giá sản phẩm mới: ");
            float price = Float.parseFloat(sc.nextLine());
            System.out.print("Vui lòng nhập số lượng của sản phẩm mới: ");
            int quantity = Integer.parseInt(sc.nextLine());
            System.out.print("Vui lòng nhập thêm mô tả sản phẩm mới: ");
            String description = sc.nextLine();
            Product addedProduct = new Product(id, name, price, quantity, description);
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
        Product checkIdProduct = repository.getById(id);
        if (checkIdProduct == null) {
            System.out.println("Không tìm thấy sản phẩm có ID: " + id);
        } else {
            System.out.println("Bạn có chắc muốn xoá sản phẩm này không? \n" +
                    "1. Có \n" +
                    "2. Không");
            int confirmOption = Integer.parseInt(sc.nextLine());
            if(confirmOption == 1){
                    repository.deleteProduct(checkIdProduct);
                    System.out.println("Xoá thành công! ");
            } else {
                System.out.println("Cảm ơn lòng bao dung của bạn vì đã không xoá sản phẩm =))");
            }
        }

    }

    @Override
    public void editProduct() {
        System.out.println("Vui lòng nhập ID bạn muốn sửa: ");
        String id = sc.nextLine();
        Product checkIdProduct = repository.getById(id);
        if(checkIdProduct == null){
            System.out.println("ID không tồn tại! ");
        } else {
            System.out.println(checkIdProduct);
            loop: do {
                System.out.println("Vui lòng nhập thành phần bạn muốn sửa: \n" +
                        "1. Tên \n" +
                        "2. Giá \n" +
                        "3. Số lượng \n" +
                        "4. Mô tả \n" +
                        "5. Cập nhật thông tin và Thoát");
                int editOption = Integer.parseInt(sc.nextLine());
                switch (editOption){
                    case 1:
                        System.out.println("Vui lòng nhập tên mới: ");
                        checkIdProduct.setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Vui lòng nhập giá mới: ");
                        checkIdProduct.setPrice(Float.parseFloat(sc.nextLine()));
                        break;
                    case 3:
                        System.out.println("Vui lòng nhập số lượng mới: ");
                        checkIdProduct.setQuantity(Integer.parseInt(sc.nextLine()));
                        break;
                    case 4:
                        System.out.println("Vui lòng nhập mô tả mới: ");
                        checkIdProduct.setDescription(sc.nextLine());
                        break;
                    case 5:
                        repository.update(checkIdProduct);
                        break loop;
                }
            }while(true);

        }
    }

    @Override
    public void displayProduct() {
        List <Product> productList = repository.getAll();
        for (Product product : productList) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }
}
