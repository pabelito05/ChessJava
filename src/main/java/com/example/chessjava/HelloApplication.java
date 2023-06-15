package com.example.chessjava;

import com.example.chessjava.Logic.Board;
import com.example.chessjava.Logic.Square;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        int a = 100;
        final GridPane gridPane = new GridPane();
        Board.initializePieces();
        Square[] squareArray = Board.getSquareArray();
        for(int i=0;i<64;i++){
                Rectangle r = new Rectangle(a, a, a, a);
                r.setFill(squareArray[i].getColor());
                int fi = i;
                r.setOnMouseClicked(t -> {
                    Square[] squareArray2 = Board.getSquareArray();
                    if(Board.getCurrPiece()!=null){
                        if(Board.getCurrPiece().getLegalMoves().contains(fi)){
                            squareArray2[Board.getCurrPiece().getPosition().getI()].removePiece();
                            Board.getCurrPiece().setPosition(squareArray2[fi]);
                            squareArray2[fi].putPiece(Board.getCurrPiece());
                            Board.setCurrPiece(null);
                            Board.moved();
                        }else if(squareArray2[fi].isOccupied())
                            if(Board.canMove(squareArray2[fi].getOccupyingPiece().getColor()))
                                Board.setCurrPiece(squareArray2[fi].getOccupyingPiece());

                    }else if(squareArray2[fi].isOccupied())
                        if(Board.canMove(squareArray2[fi].getOccupyingPiece().getColor()))
                            Board.setCurrPiece(squareArray2[fi].getOccupyingPiece());

                });
                if(squareArray[i].isOccupied()) r.setFill(squareArray[i].getOccupyingPiece().getImage());
                gridPane.add(r,i%8,i/8);
        }
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Square[] squareArray2 = Board.getSquareArray();
                        for(int j=0;j<64;j++){
                            if(gridPane.getChildren().get(j) instanceof Rectangle r2){
                                if(squareArray2[j].isOccupied()) r2.setFill(squareArray2[j].getOccupyingPiece().getImage());
                                else r2.setFill((j/8 % 2) == (j%8 % 2) ? Color.WHITE : Color.BLACK);
                            }
                        }
                    }
                },
                0,50
        );
        Scene scene = new Scene(gridPane);
        stage.setTitle("Chess!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}