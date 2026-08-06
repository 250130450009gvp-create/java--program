public class Employ{
    private int idNo;
    private String name;
    private int salary;
 private boolean isActive;
    
    public Employ(int idNo,String name ,int salary,boolean isActive){
        this.idNo=idNo;
        this.name=name;
        this.salary=salary;
       this.isActive=isActive;
    }

    public void setidNo(int idNo){
        this.idNo=idNo;
    }

    public void setname( String name){
        this.name=name;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    public void setisActive(boolean isActive){
        this.isActive=isActive;
    }

public int getidNo(){
return idNo;

    }
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
    public boolean getisActive(){
        return isActive;
    }

    public void display(){
        System.out.println("id :" + idNo );
        System.out.println("name :" + name );
        System.out.println("salary :" + salary);
         System.out.println("Active :" + isActive);


    }

}