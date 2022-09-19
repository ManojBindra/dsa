import java.util.ArrayList;
import java.util.List;

public class GridSearch {
    public static void main(String[] args) {
        char[][] grid = {{'a','b','a','b'},{'a','b','e','b'},{'e','b','e','b'}};
        searchWord(grid, "abe");
    }

    public static int[][] searchWord(char[][] grid, String word)
    {
        List<int[]> resultList = new ArrayList<>();
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length; col++){
                if(grid[row][col] == word.charAt(0)){
                    boolean res = searchGrid(row,col,grid,word);
                    // System.out.println("row= "+ row+" col= "+col+" res= " + res);
                    if(res){
                        resultList.add(pair(row,col));
                    }
                }
            }
        }
        
        int[][] result = new int[resultList.size()][2];
        for(int i=0; i<resultList.size(); i++){
            result[i][0] = resultList.get(i)[0];
            result[i][1] = resultList.get(i)[1];
        }
        return result;
      
    }

    static int[] pair(int a, int b){
        return new int[]{a,b};
    }
    
    static boolean searchGrid(int row, int col, char[][] grid, String word){
        int Rows = grid.length;
        int Cols = grid[0].length;
        int[] x = {0,0,1,-1,1,-1,1,-1};
        int[] y = {1,-1,0,0,-1,1,1,-1};
        for(int dir = 0; dir<8; dir++){
            int currentRow = row;
            int currentCol = col;
            int i = 0;
            for(; i<word.length();i++){
                if(currentRow<0 || currentRow>=Rows || currentCol <0 || currentCol >= Cols){
                    break;
                }
                if(grid[currentRow][currentCol] != word.charAt(i)){
                    break;
                }
                currentRow += x[dir];
                currentCol += y[dir];
            }
            if(i == word.length())
                return true;
        }
        return false;
    }
}
