package Model.Classes;

import lombok.Data;

@Data
public class Product {
    private static Integer abstractID = 0;
    private Integer id;
    private String name;
    private Integer amount;
    private Double price;

    public Product(String name, Integer amount, Double price) {
        this.id = ++abstractID;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    public void increaseAmount(Integer quantity){
        amount += quantity;
    }
    public void decreaseAmount(Integer quantity){
        amount -= quantity;
    }
    @Override
    public String toString() {
        return "Product: ID = " + getId() + " " + getName() + ", amount = " + getAmount() +
                ", price = " + getPrice();
    }
}
