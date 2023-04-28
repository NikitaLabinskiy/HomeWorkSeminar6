package View;

import Model.Classes.Product;
import Model.Classes.WareHouse;
import Model.Interfaces.Message;
import Model.Interfaces.WareHouseInfo;

public class View implements WareHouseInfo, Message {
    @Override
    public void homeDelivery(Product product, String address) {
        System.out.println("\nПродукт: " + product.getName() + " отправлен по адресу - " + address);
    }
    @Override
    public void selfDelivery(Product product) {
        System.out.println("\nПродукт: " + product.getName() + " отгружен на склад");
    }
    @Override
    public void getWareHouseInfo(WareHouse wareHouse) {
        System.out.println();
        for (Product product: wareHouse.getStorage()) {
            System.out.println(product);
        }
    }
    @Override
    public void getWarehouseAmount(WareHouse wareHouse) {
        System.out.println("\n" + wareHouse.getWareHouseAmount());
    }
    public void printProduct(Product product){
        System.out.println(product);
    }
}
