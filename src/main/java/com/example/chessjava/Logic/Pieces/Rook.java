package com.example.chessjava.Logic.Pieces;


import com.example.chessjava.Logic.Board;
import com.example.chessjava.Logic.Coordinates;
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
    public List<Coordinates> getLegalMoves() {
        List<Coordinates> legalMovesList = new ArrayList<>();
        int x = square.getX();
        int y = square.getY();
        Square[] squareArray = Board.getSquareArray();
//        for(int i=x+1;i<8;i++){
//            if (squareArray[i][y].isOccupied()){
//                if(squareArray[i][y].getOccupyingPiece().getColor()!=color) legalMovesList.add(new Coordinates(i,y));
//                else break;
//            }else legalMovesList.add(new Coordinates(i,y));
//        }
//        for(int i=x-1;i>=0;i--){
//            if (squareArray[i][y].isOccupied()){
//                if(squareArray[i][y].getOccupyingPiece().getColor()!=color) legalMovesList.add(new Coordinates(i,y));
//                else break;
//            }else legalMovesList.add(new Coordinates(i,y));
//        }
//        for(int i=y+1;i<8;i++){
//            if (squareArray[x][i].isOccupied()){
//                if(squareArray[x][i].getOccupyingPiece().getColor()!=color) legalMovesList.add(new Coordinates(x,i));
//                else break;
//            }else legalMovesList.add(new Coordinates(x,i));
//        }
//        for(int i=y-1;i>=0;i--){
//            if (squareArray[x][i].isOccupied()){
//                if(squareArray[x][i].getOccupyingPiece().getColor()!=color) legalMovesList.add(new Coordinates(x,i));
//                else break;
//            }else legalMovesList.add(new Coordinates(x,i));
//        }
        return legalMovesList;
    }

    @Override
    public ImagePattern getImage() {
        return image;
    }
}
