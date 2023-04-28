package Model.Classes;

import Model.Interfaces.OrderInterface;
import Model.View.View;

public class Order implements OrderInterface {
    @Override
    public void getHomeOrder(Integer productId, Integer amount, WareHouse wareHouse, HomeDelivery homeDelivery, String address, View view) {
        for (Product product: wareHouse.getStorage()) {
            if (product.getId() == productId){
                homeDelivery.deliverProduct(product, address, view);
                wareHouse.setWareHouseAmount(wareHouse.getWareHouseAmount() + amount);
                product.decreaseAmount(amount);
            }
        }
    }
    @Override
    public void getSelfOrder(Integer productId, Integer amount, WareHouse wareHouse, SelfDelivery selfDelivery, View view) {
        for (Product product: wareHouse.getStorage()) {
            if (product.getId() == productId){
                selfDelivery.deliverProduct(product, view);
                wareHouse.setWareHouseAmount(wareHouse.getWareHouseAmount() - amount);
                product.decreaseAmount(amount);
            }
        }
    }
}
