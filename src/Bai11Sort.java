import java.util.ArrayList;
import java.util.Scanner;

public class Bai11Sort {
    public static ArrayList<Product> sortByPrice(ArrayList<Product> listProduct){
        for (int i = 1; i < listProduct.size() ; i++){
            Product product = listProduct.get(i);
            int j = i-1;
            while (j >= 0 && product.getPrice() < listProduct.get(j).getPrice()){
                listProduct.set(j+1, listProduct.get(j));
                j--;
            }
            listProduct.set(j+1, product);
        }
        return listProduct;
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

        sortByPrice(listProduct);
        for(Product pro:listProduct){
            System.out.println(pro.toString());
        }
    }
}
