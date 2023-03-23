package com.progra.squaresquare;

public class KataSquare {
    private int[] initArray;
    private int[] finalArray;

    public KataSquare( int[] numberList){
        this.initArray = numberList;
        this.finalArray = new int[this.initArray.length];
    }

    public boolean isSquare(int number){

        boolean result = false;

        if (number >= 0){
            int squareRoot = (int) Math.sqrt(number);

            result = (squareRoot * squareRoot) == number;
        }

        return result;
    }

    public int[] getSquares(){

        for (int i = 0; i< this.initArray.length; i++){

            int currentItem = this.initArray[i];

            if (this.isSquare(currentItem)){
                this.finalArray[i] = (int) Math.sqrt(currentItem);
            }else{
                this.finalArray[i] = currentItem * currentItem;
            }

        }
        return this.finalArray;
    }

    public void print(){

        System.out.print("[ ");
        for(int i = 0; i< finalArray.length; i++) {
            System.out.print(" " + finalArray[i] + " ");
        }
        System.out.println("]");
    }
}
