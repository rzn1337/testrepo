package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Shape> arrlist = new ArrayList<>();

        arrlist.add(new Sphere(5.0));
        arrlist.add(new Cuboid(6.0, 5.0 , 4.0));
        arrlist.add(new Cylinder(5.0, 3.0));
        arrlist.add(new Cube(4.0));

//        Iterator itr = arrlist.iterator();
//
//        while(itr.hasNext()) {
//            System.out.println(itr.next() + "\n");
//
//        }

        for (Shape i : arrlist){
            System.out.println(i);
        }
    }

}
