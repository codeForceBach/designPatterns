package main.java.code.TicTacToe.src.cs3500.tictactoe.controller;

import main.java.code.TicTacToe.src.cs3500.tictactoe.model.Piece;
import main.java.code.TicTacToe.src.cs3500.tictactoe.model.TicTacToeModel;
import main.java.code.TicTacToe.src.cs3500.tictactoe.strategy.Posn;
import main.java.code.TicTacToe.src.cs3500.tictactoe.strategy.PosnStrategy;

/**
 * A simple Player implementation that delegates most of its
 * complexity to a {@link PosnStrategy}
 * for choosing where to play next
 */
public class PlayerImpl implements Player {
  private final Piece piece;
  private PosnStrategy posnStrategy;

  public PlayerImpl(Piece piece, PosnStrategy strategy) {
    this.piece = piece;
    this.posnStrategy = strategy;
  }
  @Override
  public Posn play(TicTacToeModel model) {
    return posnStrategy.choosePosn(model, this.piece);
  }

  @Override
  public Piece getPiece() {
    return this.piece;
  }
}
