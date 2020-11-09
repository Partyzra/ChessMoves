package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to this Knight Movement Function!");

        // I need to declare the starting position of the Knight to the board.
        // X and Y are 0 based
        // ChessPosition returns true notation
        int xs = 5;
        int ys = 5;

        KnightPosition(xs, ys);

    }

    /*************************************************************
     *
     * KnightPosition
     * Print out all possible knight moves given correct initial placement
     * Errors print if invalid initial placement
     * xs = Starting X Position
     * ys = Starting Y Position
     *


    * ************************************************************/
    static void KnightPosition(int xs, int ys) {
        // Validate parameters (if it Out of Bounds it is INVALID)
        boolean isValid = true;
        if (xs < 0 || xs > 7) {
            System.out.println("ERROR: Invalid X Parameter of ("+xs+","+ys+")");
            isValid = false;
        }
        if (ys < 0 || ys > 7) {
            System.out.println("ERROR: Invalid Y Parameter of ("+xs+","+ys+")");
            isValid = false;
        }
        if (!isValid)
            return;
        System.out.println("The starting position is (" + xs + "," + ys + ") or " + ChessPosition(xs,ys));


    // now I want to call the Output function with Knight's possible moves
        OutputK(xs-2, ys-1);
        OutputK(xs-2, ys+1);
        OutputK(xs-1, ys-2);
        OutputK(xs-1, ys+2);
        OutputK(xs+1, ys-2);
        OutputK(xs+1, ys+2);
        OutputK(xs+2, ys-1);
        OutputK(xs+2, ys+1);
    }

    // Output prints only valid moves. Anything out of bounds is not printed.
    static void OutputK(int x, int y){

        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            System.out.println("-->"+ "(" + x + "," + y + ") or " + ChessPosition(x,y));
        }
    }

    // ChessPosition returns true notation
    static String ChessPosition(int x, int y) {
        char TrueChessGrid = (char)( (int)'a' + x);
        return "" + TrueChessGrid + (y+1);
    }




}
