package edu.mce.sabariraj.mobileshop.utils;

import edu.mce.sabariraj.mobileshop.models.Mobile;

import java.util.function.Predicate;
public class Brandfliter implements Predicate<Mobile> {
    private String brand;

    public Brandfliter(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean test(Mobile mobile) {
        return (mobile.getBrand().equals(this.brand));
    }
}
