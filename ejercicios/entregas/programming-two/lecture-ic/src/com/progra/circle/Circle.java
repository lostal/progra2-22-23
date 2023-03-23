package com.progra.circle;

public class Circle {

    public Circle(){

    }
    public Circle(int radius){
        this.radius = radius;
    }

    public void setCenter(int x, int y) {
        x_center = x;
        y_center = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public double length(){
        return ( 2*PI*radius );
    }

    public double area(){
        return ( PI*radius*radius );
    }



    //Based on https://javascript.plainenglish.io/can-you-print-a-circle-on-the-browser-console-1dec46f9136a
    public double draw(){
        int xSize = 10;
        int ySize = 10;

        String output = "";

        for(int x = 0; x < xSize; x ++) {
            for(int y = 0; y < ySize; y ++) {

                if(Math.sqrt(Math.pow(x - xSize / 2, 2) + Math.pow(y - ySize / 2, 2)) <= this.radius)
                    output += "**";
                else
                    output += "  ";
            }
            output += "\n";
        }

        System.out.println(output);
        return 1;

    }


    private int x_center;
    private int y_center;
    private int radius;
    private static final double PI = 3.14159265358979323;
}
