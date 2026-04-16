package LeetCode;

public class Numberofislands200 {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int count =0;
        for(int row =0;row< grid.length;row++){
            for(int col =0; col< grid[0].length;col++){
                if(grid[row][col] == '1'){
                    dfs(grid, row, col);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int row, int col){
        if(row < 0 || row >= grid.length || col<0 || col>= grid[0].length ||
                grid[row][col] == '0')
            return ;

        grid[row][col] = '0';

        dfs(grid, row-1, col);
        dfs(grid, row+1, col);
        dfs(grid, row, col-1);
        dfs(grid, row, col+1);


    }

}

class TestNumberofislands200 {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        Numberofislands200 numberofislands200 = new Numberofislands200();
        System.out.println("No of Islands " + numberofislands200.numIslands(grid));
    }
}
