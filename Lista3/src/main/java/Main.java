import br.edu.fatecfranca.ex0.CarItem;
import br.edu.fatecfranca.ex0.Product;

public class Main {
    public static void main(String[] args) {
        Product obj1 = new Product("Monitor", 600, 1);
        CarItem obj2 = new CarItem(1, 5, obj1);

        Product obj3 = new Product("Teclado", 140, 2);
        CarItem obj4 = new CarItem(2, 6, obj1);

        Product obj5 = new Product("Mouse", 90, 3);
        CarItem obj6 = new CarItem(3, 10, obj3);

        CarItem obj7 = new CarItem(4, 15, obj3);
        CarItem obj8 = new CarItem(5, 20, obj5);

        System.out.println(obj2.toString());
        System.out.println(obj4.toString());
        System.out.println(obj6.toString());
        System.out.println(obj7.toString());
        System.out.println(obj8.toString());
    }
}
