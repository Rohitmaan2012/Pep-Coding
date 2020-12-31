import java.util.Scanner;
public class l_001_floodfill {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodFill(arr,0,0,"",visited);
    }
    public static void floodFill(int[][] maze, int row, int col, String path, boolean[][] visited) {
        if(row<0 || col<0 || row==maze.length || col==maze[0].length || 
        maze[row][col]==1 || visited[row][col]==true) {
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1) {
            System.out.println(path);
            return;
        }
        visited[row][col] = true;
        floodFill(maze,row-1,col,path+"t",visited);     //top
        floodFill(maze,row,col-1,path+"l",visited);     //left
        floodFill(maze,row+1,col,path+"d",visited);     //down
        floodFill(maze,row,col+1,path+"r",visited);     //right
        visited[row][col] = false;
    }
}