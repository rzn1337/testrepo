package Task1;

public class Janitor extends Employee{

    @Override
    public int getHours() {
        return super.getHours() * 2;
    }

    @Override
    public double getSalary() {
        return super.getSalary() - 10000.0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays() - 10; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String clean() {
        return "Workin' for the man.";
    }
    
}
