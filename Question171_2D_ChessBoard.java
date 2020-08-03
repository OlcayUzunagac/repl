package week7_Array_2D_ArrayList;

import java.util.Arrays;

public class Question171_2D_ChessBoard {

	public static void main(String[] args) {
		// olcay // Jul 26, 2020
		
	/*	Given a 8x8 two-dimensional array of strings named chessboard.
		Initialize values inside an array accordingly to the chess board. 
		So first element in the array, chessboard[0][0] should have a value "1a", 
		and last element in the array, chessboard[7][7] should have a value "8h". 
		*/
		
		String[][] ChessBoard = new String[8][8];
		
		
		char temp='a';
		
		
		for(int i=0; i<ChessBoard.length; i++) {
			for(char j=0; j<ChessBoard[i].length;j++) {
							
				ChessBoard[i][j]= "" + (i+1) + temp;
				temp++;
				System.out.print(ChessBoard[i][j] + " ");
			}
			System.out.println();
			temp='a';
			
		}
//		System.out.println(Arrays.deepToString(ChessBoard));
		
	}

}
