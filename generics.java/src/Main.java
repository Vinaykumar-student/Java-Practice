import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

      product<String,Integer> product=new product<>("soap",40);
      System.out.println(product.getItem());
        System.out.println( product.getPrice());
    }
}
