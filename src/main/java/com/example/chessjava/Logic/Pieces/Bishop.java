package com.example.chessjava.Logic.Pieces;

import com.example.chessjava.Logic.Coordinates;
import com.example.chessjava.Logic.Piece;
import com.example.chessjava.Logic.Square;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

import java.util.List;

public class Bishop extends Piece {
    private final ImagePattern image;
    public Bishop(Color color, Square square) {
        super(color, square);
        image = new ImagePattern(new Image(getClass().getResource("/image/" +color+"_"+square.getColor()+"_Bishop.png").toExternalForm()));
    }

    @Override
    public List<Coordinates> getLegalMoves() {

        return null;
    }

    @Override
    public ImagePattern getImage() {
        return image;
    }
}
