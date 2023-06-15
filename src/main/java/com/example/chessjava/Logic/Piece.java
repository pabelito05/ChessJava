package com.example.chessjava.Logic;


import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

import java.util.List;

public abstract class Piece {
    protected Square square;
    protected final Color color;

    public Piece(Color color, Square square) {
        this.color = color;
        this.square = square;
    }

    public void Move(){

    }

    public Square getPosition(){
        return square;
    }

    public void setPosition(Square square){
        this.square = square;
    }

    public Color getColor(){
        return color;
    }
    public abstract ImagePattern getImage();
    public void draw(){

    }

    public abstract List<Integer> getLegalMoves();
}
