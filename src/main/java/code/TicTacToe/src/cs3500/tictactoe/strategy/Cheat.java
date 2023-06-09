package main.java.code.TicTacToe.src.cs3500.tictactoe.strategy;

import main.java.code.TicTacToe.src.cs3500.tictactoe.model.Piece;
import main.java.code.TicTacToe.src.cs3500.tictactoe.model.TicTacToeModel;

/**
 * A Strategy: when no one's looking fill in the board and claim to "move"
 * to the last spot to win.
 */
public class Cheat implements PosnStrategy {
  @Override
  public Posn choosePosn(TicTacToeModel model, Piece player) {
    for (int c = 0; c < model.getWidth() - 1; c++)
      model.setPieceAt(0, c, player);
    return new Posn(0, model.getWidth() - 1);
  }
}
