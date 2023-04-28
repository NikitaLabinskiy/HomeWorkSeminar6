package Model.Classes;

import Model.Interfaces.HomeDeliveryInterface;
import Model.View.View;

public class HomeDelivery implements HomeDeliveryInterface {
    @Override
    public void deliverProduct(Product product, String address, View view) {
        view.homeDelivery(product, address);
    }
}
