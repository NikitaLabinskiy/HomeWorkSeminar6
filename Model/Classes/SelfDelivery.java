package Model.Classes;

import Model.Interfaces.SelfDeliveryInterface;
import View.View;

public class SelfDelivery implements SelfDeliveryInterface {
    @Override
    public void deliverProduct(Product product, View view) {
        view.selfDelivery(product);
    }
}
