public class NQueens{
	int row;
	int column;
	int q;
	int [][] board;
	public NQueens(int n){
		row = n;
		column = n;
		q=n;
		board = new int [n][n];

	}
	public boolean placeNQueens() throws Exception{
		if(q <4){
			throw new Exception("no solution");
		}
		if(q==1){
			throw new Exception("no solution");
		}
		if(row ==q)
			return true;
		
		
		for(int col= 0;col<q;col++){
			if(canPlaceQueen(row,col)){
				board[row][col]=1;
				row++;
			}
			if(placeNQueens()){
				return true;
			}
			board[row][col]=0;
		}

		return false;
	}
	boolean canPlaceQueen( int row, int col) 
    { 
        int i, j; 
  
        for (i = 0; i < col; i++) 
            if (board[row][i] == 1) 
                return false; 
  
        
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 1) 
                return false; 
  

        for (i = row, j = col; j >= 0 && i < q; i++, j--) 
            if (board[i][j] == 1) 
                return false;
        
        return true; 
    } 
    public void printToConsole(){
    	for(int i = 0 ; i<q;i++){
    		for(int j =0;j<q;j++){
    			if(board[i][j] == 0){
    				System.out.print("_");
    			}
    			System.out.print("Q");
    		}
    		System.out.println();

    	}
    }
}