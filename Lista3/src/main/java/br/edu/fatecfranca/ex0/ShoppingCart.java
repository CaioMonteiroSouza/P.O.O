package br.edu.fatecfranca.ex0;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private double price;
    private String endereco;
    private String formaPagto;
    private List<CarItem> carItem;

    public ShoppingCart() {
        this.formaPagto = "";
        this.endereco = "";
        carItem = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, String endereco, String formaPagto) {
        this.id = id;
        this.price = 0;
        this.endereco = endereco;
        this.formaPagto = formaPagto;
        this.carItem = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    public List<CarItem> getCarItem() {
        return carItem;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", price=" + price +
                ", endereco='" + endereco + '\'' +
                ", formaPagto='" + formaPagto + '\'' +
                ", carItem=" + carItem +
                '}';
    }

    public void addCarItem(int id, int quantity, Product product) {
        this.carItem.add(new CarItem(id, quantity, product));
    }

    public void valorTotal() {
        double total = 0;
        for (CarItem carItem : carItem) {
            total += carItem.getProduct().getPrice() * carItem.getQuantity();;
        }
        setPrice(total);
    }
}
