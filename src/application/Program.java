package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		
		
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Posicao inicial: ");
			ChessPosition source = UI.readChessPosition(ler);
			
			System.out.println();
			System.out.print("Posicao desejada: ");
			ChessPosition target = UI.readChessPosition(ler);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	} 

}
