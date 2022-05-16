import java.util.ArrayList;
import java.util.Scanner;

public class Bai6Sort {
    public static ArrayList<Product> findProductByPrice(ArrayList<Product> listProduct, int newPrice){
        ArrayList<Product> newProduct = new ArrayList<>();
        for (Product pr: listProduct){
            if (newPrice >= pr.price){
                newProduct.add(pr);
            }
        }
        return newProduct;
    }

    public static void main(String[] args) {

        ArrayList<Product> listProduct = new ArrayList<>();
        Product product1 = new Product("CPU", 750, 10, 1);
        Product product2 = new Product("RAM", 50, 2, 2);
        Product product3 = new Product("HDD", 70, 1, 2);
        Product product4 = new Product("Main", 400, 3, 1);
        Product product5 = new Product("Keyboard", 30, 8, 4);
        Product product6 = new Product("Mouse", 25, 50, 4);
        Product product7 = new Product("VGA", 60, 35, 3);
        Product product8 = new Product("Monitor", 120, 28, 2);
        Product product9 = new Product("Case", 120, 28, 5);
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product6);
        listProduct.add(product7);
        listProduct.add(product8);
        listProduct.add(product9);


        Scanner input = new Scanner(System.in);
        System.out.print("Nhập price:");
        int a = input.nextInt();
        ArrayList<Product> newProduct2 = findProductByPrice(listProduct,a);
        for(Product pro : newProduct2 ){
            System.out.println(pro.toString());
        }
    }
}
