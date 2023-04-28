package Model.Classes;

import Model.Interfaces.SelfDeliveryInterface;
import Model.View.View;

public class SelfDelivery implements SelfDeliveryInterface {
    @Override
    public void deliverProduct(Product product, View view) {
        view.selfDelivery(product);
    }
}
