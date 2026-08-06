public class Emain{

    public static void main(String[] args){
        Employ e1 = new Employ(455,"brijesh",500000,true);

        e1.display();

        e1.setidNo(805);
        e1.setname("subham");
        e1.setsalary(550000);
        e1.setisActive(true);

        System.out.println("\nAfter Changing:");

        System.out.println("idNo:" + e1.getidNo());
         System.out.println("name:" + e1.getname());
          System.out.println("salary:" + e1.getsalary());
          System.out.println("isActive:" + e1.getisActive());




    }
}