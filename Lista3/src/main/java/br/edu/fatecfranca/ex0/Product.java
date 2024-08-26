package br.edu.fatecfranca.ex0;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product() {
        this.name = "";
        this.price = 0;
        this.id = 0;
    }

    public Product(String name, double price, int id) {
        setName(name);
        setPrice(price);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Price must be greater than 0");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
        else {
            System.out.println("Id must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
