package application;


import chess.ChessMatch;

public class Program {
 public static void main(String[] args) {
    

    ChessMatch chessMatch = new ChessMatch(); // instância uma partida nova
    UI.printBoard(chessMatch.getPieces()); // chama
 }
}