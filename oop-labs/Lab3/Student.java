public class Student {

    public String fname;
    public String lname;
    String courses[] = {"Math", "", "Science", "", "English", "", "Urdu", "", "Chinese", ""};

    public Student(String fn, String ln) {

        this.fname=fn;
        this.lname=ln;

        for (int i = 1; i < 10; i+=2) {
            courses[i] = "" + Student.randomNum();
        }
    }



    public static int randomNum() {

        int x = 0 + (int)(Math.random() * ((100 - 0) + 1));
        return x;

    }

    public String calculateGrade(String x) {

        int y = Integer.parseInt(x);

        if (y > 90) {
            return "A";
        } else if (y > 80 && y <= 90) {
            return "B";
        } else if (y > 70 && y <= 80){
            return "C";
        } else if (y > 60 && y <= 70) {
            return "D";
        } else if (y > 20 && y <= 60) {
            return "E";
        } else {
            return "F";
        }

    }

    public void getDetails() {

        System.out.println("FirstName: " + fname);
        System.out.println("LastName: " + lname);
        System.out.println(courses[0]+ ":" + courses[1] + " " +calculateGrade(courses[1]));
        System.out.println(courses[2]+ ":" + courses[3] + " " +calculateGrade(courses[3]));
        System.out.println(courses[4]+ ":" + courses[5] + " " +calculateGrade(courses[5]));
        System.out.println(courses[6]+ ":" + courses[7] + " " +calculateGrade(courses[7]));
        System.out.println(courses[8]+ ":" + courses[9] + " " +calculateGrade(courses[9]));

    }

    public void getBest(Student obj) {

        System.out.println("Best Student: ");
        System.out.println("FirstName: " + obj.fname);
        System.out.println("LastName: " + obj.lname);


    }

    public String toString() {
        return (this.fname + " " + this.lname + " " + this.courses[1] +" "+ this.courses[3] + " " + this.courses[5] + " " + this.courses[7] + " " + this.courses[9]);
    }


}