package main.java.code.TicTacToe.src.cs3500.tictactoe.controller;

import main.java.code.TicTacToe.src.cs3500.tictactoe.model.Piece;
import main.java.code.TicTacToe.src.cs3500.tictactoe.model.TicTacToeModel;
import main.java.code.TicTacToe.src.cs3500.tictactoe.strategy.Posn;

/**
 * A simple Player interface
 */
public interface Player {
  Posn play(TicTacToeModel model);
  Piece getPiece();
}
