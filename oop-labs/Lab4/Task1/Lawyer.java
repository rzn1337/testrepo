package Task1;

public class Lawyer extends Employee{
    
    @Override
    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    @Override
    public String getVacationForm() {
        return "pink";
    }
    
    public String Sue() {
        return "I will see you in court.";
    }
    
}
