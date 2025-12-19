package edu.mce.sabariraj.mobileshop.utils;

import edu.mce.sabariraj.mobileshop.models.Mobile;

import java.util.function.Predicate;

public class PriceFliter implements Predicate<Mobile> {
    private Double price;

    public PriceFliter(Double price) {
        this.price = price;
    }

    @Override
    public boolean test(Mobile mobile) {
        return mobile.getPrice()>price;
    }
}
