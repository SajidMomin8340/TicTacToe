package TicTac.model;
public class Board {

	private Box[][] matrix = new Box[3][3];

	public void setMove(int row, int col, CharType charType) {
	    if (matrix[row][col] == null) {
	        matrix[row][col] = new Box(charType);
	    }
	}

	public boolean isEmpty(int row, int col) {
		if (matrix[row][col] == null)
			return true;
		return false;
	}

	public Box[][] getMetrix() {
		return matrix;
	}

	public boolean isWin(CharType ct) {
		return Utils.isWin(matrix, ct);
	}

	public void printBoard() {
		System.out.println("    1   2   3");

		for (int r = 0; r < 3; r++) {
			System.out.println("  +---+---+---+");

			System.out.print((r + 1) + " |");
			for (int c = 0; c < 3; c++) {
				CharType ct = (matrix[r][c] == null) ? null : matrix[r][c].getCharType();
				System.out.print(" " + (ct == null ? " " : ct) + " |");
			}
			System.out.println();
		}
		System.out.println("  +---+---+---+");
	}

}
