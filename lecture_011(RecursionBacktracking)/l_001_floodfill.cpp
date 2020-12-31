#include<iostream>
#include<vector>
#include<string>
using namespace std;

void floodfill(vector<vector<int>> &maze, int row, int col, string path, vector<vector<bool>> &visited) {
    if(row<0 || col<0 || row==maze.size() || col==maze[0].size() || 
    maze[row][col]==1 || visited[row][col]==true) {
        return;
    }
    if(row==maze.size()-1 && col==maze[0].size()-1) {
        cout<<path<<endl;
        return;
    }
    visited[row][col] = true;
    floodfill(maze,row-1,col,path+"t",visited);     //top
    floodfill(maze,row,col-1,path+"l",visited);     //left
    floodfill(maze,row+1,col,path+"d",visited);     //down
    floodfill(maze,row,col+1,path+"r",visited);     //right
    visited[row][col] = false;
}
int main() {
    int n,m;
    cin>>n,m;
    vector<vector<int>>arr(n,vector<int>(m,0));
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[0].size(); j++) {
            cin>>arr[i][j];
        }
    }
    vector<vector<bool>>visited(n,vector<bool>(m,0));
    floodfill(arr,0,0,"",visited);

    return 0;
}