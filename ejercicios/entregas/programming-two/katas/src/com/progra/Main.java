package com.progra;

import com.progra.squaresquare.KataSquare;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] listNumbers = new int[] {4, 3, 9, 7, 2, 1};
        KataSquare ks = new KataSquare(listNumbers);

        ks.getSquares();
        ks.print();

    }
}
