package Task1;

public class Marketer extends Employee{

    @Override
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
   
   public String advertise() {
       return "Act now, while supplies last!";
   }
    
}
