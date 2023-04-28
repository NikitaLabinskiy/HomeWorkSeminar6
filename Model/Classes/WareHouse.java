package Model.Classes;

import Model.Interfaces.WareHouseInterface;
import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Data
public class WareHouse implements WareHouseInterface {
    List<Product> storage;
    private Integer wareHouseAmount;
    public WareHouse(Integer wareHouseAmount) {
        this.storage = new ArrayList<>();
        this.wareHouseAmount = wareHouseAmount;
    }
    @Override
    public void addProduct(Product product) {
        storage.add(product);
        this.wareHouseAmount = getWareHouseAmount() - product.getAmount();
    }
    @Override
    public void deleteProduct(Integer productId) {
        Iterator<Product> iterator = storage.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if (product.getId() == productId){
                iterator.remove();
                this.wareHouseAmount = getWareHouseAmount() + product.getAmount();
            }
        }
    }
}
