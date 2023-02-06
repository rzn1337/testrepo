import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


       java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File("Data.txt"));

        Student[] studarray = new Student[20];


        String[] fname = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] lname = {"k", "l", "m", "n", "o", "p", "q", "r", "s", "t"};

        for (int i = 0; i < studarray.length; i++) {

            studarray[i] = new Student(randomName(fname), randomName(lname));
        }


        for (int i = 0; i < studarray.length; i++) {
            writer.println(studarray[i].toString());
        }

        writer.close();



        // Task 3


        Scanner sc = new Scanner(new java.io.File("C:\\Users\\Syed Ali Rizwan\\IdeaProjects\\Lab3\\Data.txt"));

        int highestmarks = 0;
        int objectIndex = 0;
        int total = 0;

        while (sc.hasNext()) {
            for (int i = 0; i < studarray.length; i++) {
                total = 0;
                boolean flagforF = false;
                String x = sc.nextLine();
                String[] arr = x.split(" ");
                for (int j = 2; j < 7; j++) {
                    total +=  Integer.parseInt(arr[j]);
                }
                for (int j = 2; j < 7; j++) {
                    if (Integer.parseInt(arr[j]) <= 20) {
                        flagforF = true;
                    }
                }

                if (total > highestmarks && !flagforF) {
                    highestmarks = total;
                    objectIndex = i;
                }
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
