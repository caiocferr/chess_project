package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      ChessMatch chessMatch = new ChessMatch(); // instância uma partida nova
      while (true) {
         UI.printBoard(chessMatch.getPieces()); // chama
         System.out.println();
         System.out.print("Source: ");
         System.out.println();
         ChessPosition source = UI.readChessPosition(sc);

         System.out.print("Target: ");
         ChessPosition target = UI.readChessPosition(sc);

         ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
      }

   }
}