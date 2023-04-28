package Model.Interfaces;

import Model.Classes.Product;

public interface WareHouseInterface {
    public void addProduct(Product product);
    public void deleteProduct(Integer productID);
}
