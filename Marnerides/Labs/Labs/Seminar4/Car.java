/**
 *
 */
public class Car {
    private double price;
    private String brand;
    private String model;

    private int year;
    private double mileage;
    private String color;
    private String vin;

    public Car(double price,String brand,String model, int year, double mileage, String color, String vin){
        this.brand= brand;
        this.model= model;
        this.year= year;
        this.mileage= mileage;
        this.color= color;
        this.vin= vin;
    }
    public void setPrice(double price){
        this.price= price;
    }
    public void setBrand(String brand){
        this.brand= brand;
    }
    public void setModel(String model){
        this.model= model;
    }
    public void setYear(int year){
        this.year= year;
    }
    public void setColor(String color){
        this.color= color;
    }
    public void setVin(String vin){
        this.vin= vin;
    }
    public double getPrice(){
        return this.price;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }
    public String getModel(){
        return this.model;
    }
    public double getMileage(){
        return this.mileage;
    }
    public String getColor(){
        return this.color;
    }
    public String getVin(){
        return this.vin;
    }
}
