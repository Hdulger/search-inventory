import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InventorySearch {
    public static void main(String[] args) {


        ArrayList<Product> products = InventorySearch.getInventory();


        try{
            FileWriter writer= new FileWriter("src/main/resources/inventory.csv");

            BufferedWriter bufWriter=new BufferedWriter(writer);


        for (Product p: products) {
            System.out.printf(" %d %s  $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());

            bufWriter.write(p.getId()+p.getName()+p.getPrice()+"\n");
        }
        bufWriter.close();
        } catch (IOException e) {
            System.out.println("Input or output error");;
        }
    }


        public static ArrayList<Product> getInventory(){

        ArrayList<Product> inventory= new ArrayList<Product>();

        Product pro1=new Product(1, "|Box of Nails|",2.99);
            Product pro2=new Product(2, "|Box of Milk|",4.99);
            Product pro3=new Product(3, "|Box of Staples|",12.99);
            Product pro4=new Product(4, "|Box of vases|",10);
            Product pro5=new Product(5, "|Box of bottles|",5.21);

           inventory.add(pro1);
            inventory.add(pro2);
            inventory.add(pro3);
            inventory.add(pro4);
            inventory.add(pro5);

             return inventory;
    }
}




