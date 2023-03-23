package com.progra.vehicle;

import com.progra.circle.Circle;
import com.progra.circle.ColoredCircle;

public class Main {

    public static void main(String[] args) {


        Circle  a, b, c;


        a = new Circle(1);
        a.draw();

        b = new ColoredCircle();
        b.draw();



        Car car1 = new Car();
        //car1.setModel("KIA");

        car1.model = "";
        System.out.println( car1.getModel() );


    }
}
