package edu.mce.sabariraj.mobileshop.models;

public class Mobile {
    private Long id;
    private String model;
    private String brand;
    private Integer year_launched;
    private Double price;

    public Mobile() {
    }

    public Mobile(Long id, String brand, String model, Integer year_launched, Double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year_launched = year_launched;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear_launched() {
        return year_launched;
    }

    public void setYear_launched(Integer year_launched) {
        this.year_launched = year_launched;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10d%-15s%-25s%-10d%-15.2f",this.id,this.brand,this.model,this.year_launched,this.price);
    }

}

