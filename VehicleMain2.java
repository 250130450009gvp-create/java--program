public class VehicleMain2 {

    public static void main(String[] args) {

        
        Vehicle2 v1 = new Vehicle2("Toyota", "Fortuner", 2025);

        
        v1.display();

        
        v1.setName("Mahindra");
        v1.setBrand("Scorpio");
        v1.setYear(2024);

        System.out.println("\nAfter Changing:");

        
        System.out.println("Name  : " + v1.getName());
        System.out.println("Brand : " + v1.getBrand());
        System.out.println("Year  : " + v1.getYear());
    }
}