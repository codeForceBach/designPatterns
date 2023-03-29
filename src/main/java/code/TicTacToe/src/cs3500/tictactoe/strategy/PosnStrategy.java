package main.java.code.TicTacToe.src.cs3500.tictactoe.strategy;

import main.java.code.TicTacToe.src.cs3500.tictactoe.model.Piece;
import main.java.code.TicTacToe.src.cs3500.tictactoe.model.TicTacToeModel;

/**
 * A Strategy interface for choosing where to play next for the given player
 */
public interface PosnStrategy {
  Posn choosePosn(TicTacToeModel model, Piece player);
}
