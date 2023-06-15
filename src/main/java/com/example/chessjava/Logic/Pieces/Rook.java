package com.example.chessjava.Logic.Pieces;


import com.example.chessjava.Logic.Board;
import com.example.chessjava.Logic.Piece;
import com.example.chessjava.Logic.Square;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    private final ImagePattern image;
    public Rook(Color color, Square square) {
        super(color, square);
        image = new ImagePattern(new Image(getClass().getResource("/image/" +color+"_"+square.getColor()+"_Rook.png").toExternalForm()));
    }

    @Override
    public List<Integer> getLegalMoves() {
        List<Integer> legalMovesList = new ArrayList<>();
        int x = square.getX();
        int y = square.getY();
        Square[] squareArray = Board.getSquareArray();
        for(int i=x+1;i<8;i++){
            int z = i*8+y;
            if (squareArray[z].isOccupied()){
                if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
                break;
            }else legalMovesList.add(z);
        }
        for(int i=x-1;i>=0;i--){
            int z = i*8+y;
            if (squareArray[z].isOccupied()){
                if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
                break;
            }else legalMovesList.add(z);
        }
        for(int i=y+1;i<8;i++){
            int z = x*8+i;
            if (squareArray[z].isOccupied()){
                if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
                break;
            }else legalMovesList.add(z);
        }
        for(int i=y-1;i>=0;i--){
            int z = x*8+i;
            if (squareArray[z].isOccupied()){
                if(squareArray[z].getOccupyingPiece().getColor()!=color) legalMovesList.add(z);
                break;
            }else legalMovesList.add(z);
        }
        return legalMovesList;
    }

    @Override
    public ImagePattern getImage() {
        return image;
    }
}
