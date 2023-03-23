package com.progra.circle;

public class ColoredCircle extends Circle{

    //Por defecto si no se especifica el radio le asignamos 1
    public ColoredCircle() {
        super(1);
    }

    public ColoredCircle(int radius) {
        super(radius);
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public double draw(){
        int xSize = 10;
        int ySize = 10;

        String output = "";

        for(int x = 0; x < xSize; x ++) {
            for(int y = 0; y < ySize; y ++) {

                if(Math.sqrt(Math.pow(x - xSize / 2, 2) + Math.pow(y - ySize / 2, 2)) <= this.getRadius())
                    output += "..";
                else
                    output += "  ";
            }
            output += "\n";
        }

        System.out.println(output);
        return 1;
    }

    private int color;

}
