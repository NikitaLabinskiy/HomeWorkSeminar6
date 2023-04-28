package Model.Classes;

import Model.Interfaces.ProductSearcher;
import Model.View.View;

public class Searcher implements ProductSearcher {
    @Override
    public void findProductByName(WareHouse wareHouse, String productName, View view) {
        for (Product p : wareHouse.getStorage()) {
            if (p.getName().equals(productName))
                view.printProduct(p);
        }
    }

    @Override
    public void findProductByPrice(WareHouse wareHouse, Double productPriceMin, Double productPriceMax, View view) {
        for (Product p: wareHouse.getStorage()) {
            if (p.getPrice() >= productPriceMin && p.getPrice() <= productPriceMax)
                view.printProduct(p);
        }
    }

    @Override
    public void findProductByAmount(WareHouse wareHouse, Integer amount, View view) {
        for (Product p: wareHouse.getStorage()) {
            if (p.getAmount() >= amount)
                view.printProduct(p);
        }
    }
}
