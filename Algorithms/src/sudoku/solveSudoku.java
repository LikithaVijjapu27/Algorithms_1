package sudoku;
import java.io.*;


public class solveSudoku {
	public void printSudoku() {
		System.out.println("solving sudoku");
		System.out.println("size :"+ getSize(23));
		
	}
	
	private static int getSize(int n) {
		return n+1;
	}
	
}
