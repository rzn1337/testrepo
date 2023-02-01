public class Main {

    public static void main(String[] args) {

        Student[] studarray = new Student[20];


        String[] fname = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] lname = {"k", "l", "m", "n", "o", "p", "q", "r", "s", "t"};

        for (int i = 0; i < studarray.length; i++) {
            studarray[i] = new Student(randomName(fname), randomName(lname));
        }

        for (int i = 0; i < studarray.length; i++) {
            studarray[i].getDetails();
            System.out.println();
        }

        // Task 3

        int highestmarks = 0;
        int objectIndex = 0;
        int total = 0;

        for (int i = 0; i < studarray.length; i++) {
            total = 0;
            boolean flagforF = false;
            for (int j = 1; j < 10; j+=2) {
                total += Integer.parseInt(studarray[i].courses[j]);
            }
            for (int j = 1; j < 10; j+=2) {
                if (Integer.parseInt(studarray[i].courses[j]) <= 20) {
                    flagforF = true;
                }
            }

            if (total > highestmarks && !flagforF) {
                highestmarks = total;
                objectIndex = i;
            }
        }

        Student obj = studarray[objectIndex];

        obj.getBest(obj);




    }

    public static String randomName(String[] arr) {

        int x = (int) (Math.random()*10);
        String randomname = arr[x];
        return randomname;

    }





}
