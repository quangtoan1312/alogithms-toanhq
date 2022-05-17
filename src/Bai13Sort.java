import java.util.*;

public class Bai13Sort {
    public static Category findCategoryById(ArrayList<Category> listCategory, int categoryId){
        for (int i =0 ;i < listCategory.size(); i++){
            if(listCategory.get(i).getId() == categoryId){
                return listCategory.get(i);
            }
        }
        return null;
    }
    public static ArrayList<Product> sortByCategoryName(ArrayList<Product> listProduct, ArrayList<Category> listCategory){
        for (int i = 1; i < listProduct.size() ; i++){
            Product product = listProduct.get(i);
            Category category = findCategoryById(listCategory, listProduct.get(i).getCategoryId());
            int j = i-1;
            Category category2 = findCategoryById(listCategory, listProduct.get(j).getCategoryId());
            if (category == null){
                break;
            }
            while (j >= 0 && category2.getName().compareTo(category.getName()) > 0 && category2 != null){
                listProduct.set(j+1, listProduct.get(j));
                j--;
                if(j>0)
                category2 = findCategoryById(listCategory, listProduct.get(j).getCategoryId());
            }
            listProduct.set(j+1, product);
        }
        return listProduct;
    }

    public static void main(String[] args) {
        ArrayList<Category> listCategory = new ArrayList<Category>();
        Category category1 = new Category(1, "Computer");
        Category category2 = new Category(2, "Memory");
        Category category3 = new Category(3, "Card");
        Category category4 = new Category(4, "Accessory");
        listCategory.add(category1);
        listCategory.add(category2);
        listCategory.add(category3);
        listCategory.add(category4);

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

        sortByCategoryName(listProduct, listCategory);
        for(Product product: listProduct){
            System.out.println(product.toString());
        }
    }
}
