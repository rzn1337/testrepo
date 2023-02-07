package Task1;

public class LegalSecretary extends Secretary {

    @Override
    public double getSalary() {
        return super.getSalary() + 5000.0;
    }
    
    public String fileLegalBriefs() {
        return "I could file all day!";
    }
    
    
}
