package com.example.chessjava.Logic;


import javafx.scene.paint.Color;

public class Square {

    private int x, y, i;
    private final Color color;
    private Piece piece = null;
    Square(int i){
        this.i = i;
        x = i/8;
        y = i%8;
        color = (x % 2) == (y % 2) ? Color.WHITE : Color.BLACK;

    }

    public Color getColor(){
        return color;
    }
    public Piece getOccupyingPiece(){
        return piece;
    }

    public boolean isOccupied(){
        return piece!=null;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void putPiece(Piece piece){
        this.piece = piece;
    }

    public void removePiece(){
        piece = null;
    }

    public int getI() {
        return i;
    }
}
