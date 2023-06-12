package demo_exam.service.impl;

import demo_exam.model.Product;
import demo_exam.repository.impl.ProductRepository;
import demo_exam.service.IProductService;
import demo_exam.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final ProductRepository PRODUCT_REPOSITORY = new ProductRepository();
    private final Scanner sc = new Scanner(System.in);

    public void display() {
        List<Product> productList = PRODUCT_REPOSITORY.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void add() {
        do {
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            if (!Regex.validate(id, Regex.ID_REGEX)) {
                System.err.println("Invalid Format!");
            } else if (PRODUCT_REPOSITORY.findById(id) != null) {
                System.err.println("This ID already exist!");
            } else {
                String name;
                do {
                    System.out.println("Enter Name: ");
                    name = sc.nextLine();
                    if (Regex.validate(name, Regex.ID_NAME)) {
                        break;
                    } else {
                        System.err.println("Invalid Name!");
                    }
                } while (true);
                int price;
                do {
                    System.out.println("Enter Price:");
                    price = Integer.parseInt(sc.nextLine());
                    if (price > 0) {
                        break;
                    } else {
                        System.err.println("Price must be a positive number!");
                    }
                } while (true);
                int quantity;
                do {
                    System.out.println("Enter quantity of the product:");
                    quantity = Integer.parseInt(sc.nextLine());
                    if (quantity > 0) {
                        break;
                    } else {
                        System.err.println("Quantity must be a positive number!");
                    }
                } while (true);
                String expiredDate;
                do {
                    System.out.println("Enter expired date of the product: ");
                    expiredDate = sc.nextLine();
                    if (!Regex.validate(expiredDate, Regex.DATE_REGEX)) {
                        System.err.println("Invalid Date!");
                    } else {
                        break;
                    }
                }
                while (true);
                System.out.println("Add successfully!");
                Product product = new Product(id, name, price, quantity, expiredDate);
                PRODUCT_REPOSITORY.add(product);
                break;
            }
        } while (true);
    }

    public void delete() {
        loop:
        do {
            System.out.println("Enter ID you would like to delete:");
            String id = sc.nextLine();
            Product product = PRODUCT_REPOSITORY.findById(id);
            if (product == null) {
                System.err.println("ID: " + id + " doesn't exist!");
            } else {
                do {
                    System.out.println("Are you sure to delete ID: " + id + "\n" +
                            "1. Yes\n" +
                            "2. No\n" +
                            "Enter Number below:");
                    String deletingOption = sc.nextLine();
                    switch (deletingOption) {
                        case "1":
                            PRODUCT_REPOSITORY.delete(product);
                            System.out.println("Delete successfully!");
                            break loop;
                        case "2":
                            System.out.println("Delete unsuccessfully!");
                            break loop;
                        default:
                            System.err.println("Invalid Input!");
                    }
                } while (true);
            }
        } while (true);
    }
}
