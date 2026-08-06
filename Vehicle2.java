public class Vehicle2 {

    private String name;
    private String brand;
    private int year;

    
    public Vehicle2(String name, String brand, int year) {
        this.name = name;
        this.brand = brand;
        this.year = year;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    
    public void display() {
        System.out.println("Name   " + name);
        System.out.println("Brand  " + brand);
        System.out.println("Year   " + year);
    }
}