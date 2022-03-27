package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	
	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
	@Override
	public boolean[][] possibleMoves(){
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; //por default todas as posicoes iniciam com falso
		
		Position p = new Position(0, 0);
		
		//verificar posicoes acima da peca
		p.setValues(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//verificar posicoes abaixo da peca
		p.setValues(position.getRow() + 1, position.getColumn());
	   	if (getBoard().positionExists(p) && canMove(p)){
	   		mat[p.getRow()][p.getColumn()] = true;
		}
	   	
		//verificar posicoes a esquerda da peca
		p.setValues(position.getRow(), position.getColumn() - 1);
	   	if (getBoard().positionExists(p) && canMove(p)){
	   		mat[p.getRow()][p.getColumn()] = true;
		}
	   	
		//verificar posicoes a direita da peca
		p.setValues(position.getRow(), position.getColumn() + 1);
	   	if (getBoard().positionExists(p) && canMove(p)){
	   		mat[p.getRow()][p.getColumn()] = true;
		}
	   	
		//verificar posicoes a noroeste da peca
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
	   	if (getBoard().positionExists(p) && canMove(p)){
	   		mat[p.getRow()][p.getColumn()] = true;
		}
		
		//verificar posicoes a nordeste da peca
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
	   	if (getBoard().positionExists(p) && canMove(p)){
	   		mat[p.getRow()][p.getColumn()] = true;
		}
	   	
		//verificar posicoes a sudoeste da peca
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
	   	if (getBoard().positionExists(p) && canMove(p)){
	   		mat[p.getRow()][p.getColumn()] = true;
		}
	   	
		//verificar posicoes a sudeste da peca
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
	   	if (getBoard().positionExists(p) && canMove(p)){
	   		mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		
		return mat;
	}
}
