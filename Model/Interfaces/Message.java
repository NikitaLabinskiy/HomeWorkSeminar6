package Model.Interfaces;

import Model.Classes.Product;

public interface Message {
    public void homeDelivery(Product product, String address);
    public void selfDelivery(Product product);
}
