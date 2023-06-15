package com.example.chessjava.Logic;

import com.example.chessjava.Logic.Pieces.*;
import javafx.scene.paint.Color;


public abstract class Board {
    private static final Square[] squareArray = new Square[64];
    private static boolean whiteToMove = true;
    private static Piece currPiece = null;
    public static void initializePieces(){
        for(int i=0;i<64;i++) squareArray[i] = new Square(i);
        squareArray[0].putPiece(new Rook(Color.BLACK, squareArray[0]));
        squareArray[1].putPiece(new Knight(Color.BLACK, squareArray[1]));
        squareArray[2].putPiece(new Bishop(Color.BLACK, squareArray[2]));
        squareArray[3].putPiece(new Queen(Color.BLACK, squareArray[3]));
        squareArray[4].putPiece(new King(Color.BLACK, squareArray[4]));
        squareArray[5].putPiece(new Bishop(Color.BLACK, squareArray[5]));
        squareArray[6].putPiece(new Knight(Color.BLACK, squareArray[6]));
        squareArray[7].putPiece(new Rook(Color.BLACK, squareArray[7]));
        squareArray[8].putPiece(new Pawn(Color.BLACK, squareArray[8]));
        squareArray[9].putPiece(new Pawn(Color.BLACK, squareArray[9]));
        squareArray[10].putPiece(new Pawn(Color.BLACK, squareArray[10]));
        squareArray[11].putPiece(new Pawn(Color.BLACK, squareArray[11]));
        squareArray[12].putPiece(new Pawn(Color.BLACK, squareArray[12]));
        squareArray[13].putPiece(new Pawn(Color.BLACK, squareArray[13]));
        squareArray[14].putPiece(new Pawn(Color.BLACK, squareArray[14]));
        squareArray[15].putPiece(new Pawn(Color.BLACK, squareArray[15]));
        squareArray[48].putPiece(new Pawn(Color.WHITE, squareArray[48]));
        squareArray[49].putPiece(new Pawn(Color.WHITE, squareArray[49]));
        squareArray[50].putPiece(new Pawn(Color.WHITE, squareArray[50]));
        squareArray[51].putPiece(new Pawn(Color.WHITE, squareArray[51]));
        squareArray[52].putPiece(new Pawn(Color.WHITE, squareArray[52]));
        squareArray[53].putPiece(new Pawn(Color.WHITE, squareArray[53]));
        squareArray[54].putPiece(new Pawn(Color.WHITE, squareArray[54]));
        squareArray[55].putPiece(new Pawn(Color.WHITE, squareArray[55]));
        squareArray[56].putPiece(new Rook(Color.WHITE, squareArray[56]));
        squareArray[57].putPiece(new Knight(Color.WHITE, squareArray[57]));
        squareArray[58].putPiece(new Bishop(Color.WHITE, squareArray[58]));
        squareArray[59].putPiece(new Queen(Color.WHITE, squareArray[59]));
        squareArray[60].putPiece(new King(Color.WHITE, squareArray[60]));
        squareArray[61].putPiece(new Bishop(Color.WHITE, squareArray[61]));
        squareArray[62].putPiece(new Knight(Color.WHITE, squareArray[62]));
        squareArray[63].putPiece(new Rook(Color.WHITE, squareArray[63]));
    }

    public static Square[] getSquareArray(){
        return squareArray;
    }
    public static boolean canMove(Color color){
        return (color == Color.WHITE) == whiteToMove;
    }

    public static Piece getCurrPiece() {
        return currPiece;
    }

    public static void setCurrPiece(Piece currentPiece) {
        currPiece = currentPiece;
    }
    public static void moved(){
        whiteToMove=!whiteToMove;
    }
}
