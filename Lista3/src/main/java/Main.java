import br.edu.fatecfranca.ex0.CarItem;
import br.edu.fatecfranca.ex0.Product;
import br.edu.fatecfranca.ex0.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Product obj1 = new Product("Monitor", 600, 1);
        Product obj2 = new Product("Teclado", 140, 2);
        Product obj3 = new Product("Mouse", 90, 3);

        ShoppingCart carrinho1 = new ShoppingCart(1, "Franca", "Cartao de credito");
        carrinho1.addCarItem(1, 5, obj1);
        carrinho1.addCarItem(3, 10, obj2);
        carrinho1.valorTotal();

        System.out.println(carrinho1.toString());

        ShoppingCart carrinho2 = new ShoppingCart(2, "Batatais", "PIX");
        carrinho2.addCarItem(2, 6, obj1);
        carrinho2.addCarItem(5, 20, obj3);
        carrinho2.valorTotal();

        System.out.println(carrinho2.toString());
    }
}
