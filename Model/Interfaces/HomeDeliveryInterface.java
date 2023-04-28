package Model.Interfaces;

import Model.Classes.Product;
import View.View;

public interface HomeDeliveryInterface {
    public void deliverProduct(Product product, String address, View view);
}
