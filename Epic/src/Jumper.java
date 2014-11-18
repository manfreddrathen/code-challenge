
public class Jumper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findLongestPath(int[][] matrix, int row, int col){
		if(matrix == null || matrix.length == 0)
			return 0;
		
		int len = matrix.length;
		int[] res = new int[1];
		
		recur(matrix, row, col, 0, res);
		return res[0];
		
	}
	
	public void recur(int[][] matrix, int row, int col, int depth, int[] res){
		int len = matrix.length;
		
		if(matrix[row][col] == 1 || matrix[row][col] == 2){
			res[0] = (depth - 1) > res[0]? (depth - 1): res[0];
			return;
		}
		
		if(row == len - 1 && col == len - 1){
			res[0] = depth > res[0]? depth: res[0];
			return;
		}
			
		
		if(row <  len - 1 && col < len - 1){
			recur(matrix, row + 1, col, depth + 1, res);
			recur(matrix, row, col + 1, depth + 1, res);
		}else if(row == len - 1 && col < len - 1){
			recur(matrix, row, col + 1, depth + 1, res);
		}else if(col == len - 1 && row < len - 1){
			recur(matrix, row + 1, col, depth + 1, res);
		}
	}
}
