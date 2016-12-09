/*
  Sudoku Solver
  
  This sudoku-solver solves a sudoku puzzle given as the user input and prints the solution. 
  Joyce Choi, Michelle Park 
  
 */
import java.util.*;

public class SudokuSolover {
/*
 * The row & column size of the sudoku grid
 */
public static final int GRID_SIZE = 9; 

	public static void main(String[] args){
		int[][] unsolved = new int[GRID_SIZE][GRID_SIZE]; 
		
		fillUnsolvedGrid(unsolved); 
		solver(unsolved); 
		
		//System.out.println("after solver method called");
		printGrid(unsolved);
	}
	
	// Prompts the user to input values of the unsolved sudoku
	// and fills the empty grid with given user input values
	public static void fillUnsolvedGrid(int[][] grid){
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Enter the values of the unsolved sudoku grid,");
		System.out.println("from top to bottom, left to right,");
		System.out.println("and enter zeros for the values to be solved:");
		
		for(int i = 0; i < GRID_SIZE; i++){
			for(int j = 0; j < GRID_SIZE; j++){
				grid[i][j] = in.nextInt(); 
			}
		}
		in.close();
	}
	
	// Solves the given sudoku grid
	public static void solver(int[][] currentGrid){
		for(int i = 0; i < GRID_SIZE; i++){
			for(int j = 0; j < GRID_SIZE; j++){
				if (currentGrid[i][j] == 0) {
					findValue(currentGrid, i, j);
				}
			}
		}
		// for each cell
			// parse the row
			// parse the colum
			// parse the sub-grid
			// result: find the possible set of values for this cell
			
			// recursion? try every possible value for the cell
				// backtrack: when the requirement is not met 
					// requirement: no duplicates in each row, each column, and each sub-grid
				// remove the "wrong" value 
			
	}
	
	// Finds the correct value for the given sudoku cell
	public static void findValue(int currentGrid[][], int row, int column){
		currentGrid[row][column] = 1; 
	}
	
	// Prints current values in each index of the grid 
	public static void printGrid(int[][] currentGrid){
		for(int i = 0; i < GRID_SIZE; i++){
			for(int j = 0; j < GRID_SIZE; j ++){
				System.out.print(currentGrid[i][j]); 
			}
			System.out.println();
		}
	}
}
