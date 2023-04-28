package Model.Interfaces;

import Model.Classes.WareHouse;
import View.View;

public interface ProductSearcher {
    public void findProductByName(WareHouse wareHouse, String productName, View view);
    public void findProductByPrice(WareHouse wareHouse, Double productPriceMin, Double productPriceMax, View view);
    public void findProductByAmount(WareHouse wareHouse, Integer amount, View view);
}
