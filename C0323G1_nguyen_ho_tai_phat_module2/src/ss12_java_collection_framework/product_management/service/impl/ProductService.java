package ss12_java_collection_framework.product_management.service.impl;

import ss12_java_collection_framework.product_management.model.Product;
import ss12_java_collection_framework.product_management.repository.impl.ProductRepository;
import ss12_java_collection_framework.product_management.service.IProductService;

import java.util.List;
import java.util.Scanner;


public class ProductService implements IProductService {
    private ProductRepository repository = new ProductRepository();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.print("Vui lòng nhập ID sản phẩm mới: ");
        String id = sc.nextLine();
        Product checkIdProduct = repository.findById(id);
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
        Product checkId = repository.findById(id);
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
    public void editProduct() {
        System.out.println("Vui lòng nhập ID bạn muốn sửa: ");
        String id = sc.nextLine();
        Product product = repository.findById(id);
        if(product == null){
            System.out.println("ID không tồn tại! ");
        } else {
            System.out.println(product);
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
                        product.setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Vui lòng nhập giá mới: ");
                        product.setPrice(Float.parseFloat(sc.nextLine()));
                        break;
                    case 3:
                        System.out.println("Vui lòng nhập số lượng mới: ");
                        product.setQuantity(Integer.parseInt(sc.nextLine()));
                        break;
                    case 4:
                        System.out.println("Vui lòng nhập mô tả mới: ");
                        product.setDescription(sc.nextLine());
                        break;
                    case 5:
                        repository.updateProduct(product);
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

    @Override
    public void searchProduct() {
        System.out.println("Vui lòng nhập tên sản phẩm bạn muốn tìm: ");
        String findingName = sc.nextLine();
        List<Product> newList = repository.searchByName(findingName);
        for (Product p:newList) {
            System.out.println(p);
        }
    }

    @Override
    public void sortProduct() {
        System.out.println("Vui lòng chọn: \n" +
                "1. Giá tăng dần \n" +
                "2. Giá giảm dần ");
        int sortOption = Integer.parseInt(sc.nextLine());
        switch(sortOption){
            case 1:
                repository.sortUp();
                System.out.println("Sắp xếp thành công!");
                break;
            case 2:
                repository.sortDown();
                System.out.println("Sắp xếp thành công!");
                break;
        }
    }

}
