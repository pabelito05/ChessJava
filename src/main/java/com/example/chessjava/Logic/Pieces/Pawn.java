package com.example.chessjava.Logic.Pieces;


import com.example.chessjava.Logic.Board;
import com.example.chessjava.Logic.Piece;
import com.example.chessjava.Logic.Square;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    private final ImagePattern image;
    public Pawn(Color color, Square square) {
        super(color, square);
        image = new ImagePattern(new Image(getClass().getResource("/image/" +color+"_"+square.getColor()+"_Pawn.png").toExternalForm()));
    }
    public ImagePattern getImage(){
        return image;
    }
    @Override
    public List<Integer> getLegalMoves() {
        List<Integer> legalMovesList = new ArrayList<>();
        int x = square.getX();
        int y = square.getY();
        Square[] squareArray = Board.getSquareArray();
        if(color==Color.WHITE){
            if(!squareArray[(x-1)*8+y].isOccupied()){
                legalMovesList.add((x-1)*8+y);
                if(x==6){
                    if(!squareArray[(x-2)*8+y].isOccupied()){
                        legalMovesList.add((x-2)*8+y);
                    }
                }
            }
            if(y-1>=0){
                if(squareArray[(x-1)*8+y-1].isOccupied())
                    if(squareArray[(x-1)*8+y-1].getOccupyingPiece().getColor()==Color.BLACK)
                        legalMovesList.add((x-1)*8+y-1);
            }
            if(y+1<8){
                if(squareArray[(x-1)*8+y+1].isOccupied())
                    if(squareArray[(x-1)*8+y+1].getOccupyingPiece().getColor()==Color.BLACK)
                        legalMovesList.add((x-1)*8+y+1);
            }
        }else{
            if(!squareArray[(x+1)*8+y].isOccupied()){
                legalMovesList.add((x+1)*8+y);
                if(x==1){
                    if(!squareArray[(x+2)*8+y].isOccupied()){
                        legalMovesList.add((x+2)*8+y);
                    }
                }
            }
            if(y-1>=0){
                if(squareArray[(x+1)*8+y-1].isOccupied())
                    if(squareArray[(x+1)*8+y-1].getOccupyingPiece().getColor()==Color.WHITE)
                        legalMovesList.add((x+1)*8+y-1);
            }
            if(y+1<8){
                if(squareArray[(x+1)*8+y+1].isOccupied())
                    if(squareArray[(x+1)*8+y+1].getOccupyingPiece().getColor()==Color.WHITE)
                        legalMovesList.add((x+1)*8+y+1);
            }
        }
        return legalMovesList;
    }
}
