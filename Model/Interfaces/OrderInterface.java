package Model.Interfaces;

import Model.Classes.HomeDelivery;
import Model.Classes.Product;
import Model.Classes.SelfDelivery;
import Model.Classes.WareHouse;
import Model.View.View;

public interface OrderInterface {
    public void getHomeOrder(Integer productId, Integer amount, WareHouse wareHouse, HomeDelivery homeDelivery, String address, View view);
    public void getSelfOrder(Integer productId, Integer amount, WareHouse wareHouse, SelfDelivery selfDelivery, View view);
}
