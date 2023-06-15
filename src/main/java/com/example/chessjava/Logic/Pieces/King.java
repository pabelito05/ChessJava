package com.example.chessjava.Logic.Pieces;


import com.example.chessjava.Logic.Board;
import com.example.chessjava.Logic.Piece;
import com.example.chessjava.Logic.Square;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    private final ImagePattern image;
    public King(Color color, Square square) {
        super(color, square);
        image = new ImagePattern(new Image(getClass().getResource("/image/" +color+"_"+square.getColor()+"_King.png").toExternalForm()));
    }

    @Override
    public List<Integer> getLegalMoves() {
        List<Integer> legalMovesList = new ArrayList<>();
        int x = square.getX();
        int y = square.getY();
        Square[] squareArray = Board.getSquareArray();
        if(x+1<8){
            int z = (x+1)*8+y;
            if(!squareArray[z].isOccupied()) legalMovesList.add(z);
            else if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
        }
        if(x-1>0){
            int z = (x-1)*8+y;
            if(!squareArray[z].isOccupied()) legalMovesList.add(z);
            else if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
        }
        if(y+1<8){
            int z = x*8+y+1;
            if(!squareArray[z].isOccupied()) legalMovesList.add(z);
            else if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
        }
        if(y-1>0){
            int z = x*8+y-1;
            if(!squareArray[z].isOccupied()) legalMovesList.add(z);
            else if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
        }
        if(x+1<8 && y-1>=0){
            int z = (x+1)*8+y-1;
            if(!squareArray[z].isOccupied()) legalMovesList.add(z);
            else if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
        }
        if(x-1>0 && y-1>=0){
            int z = (x-1)*8+y-1;
            if(!squareArray[z].isOccupied()) legalMovesList.add(z);
            else if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
        }
        if(x+1<8 && y+1<8){
            int z = (x+1)*8+y+1;
            if(!squareArray[z].isOccupied()) legalMovesList.add(z);
            else if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
        }
        if(x-1>0 && y+1<8){
            int z = (x-1)*8+y+1;
            if(!squareArray[z].isOccupied()) legalMovesList.add(z);
            else if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
        }
        return legalMovesList;
    }

    @Override
    public ImagePattern getImage() {
        return image;
    }
}
