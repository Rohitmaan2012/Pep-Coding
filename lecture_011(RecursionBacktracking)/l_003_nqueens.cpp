#include<iostream>
#include<vector>
#include<string>
using namespace std;

bool isSafe(vector<vector<int>> &chess, int row, int col) {
    //vertical
    for(int i=row-1, j=col; i>=0; i--) {
        if(chess[i][j]==1) {
            return false;
        }
    }
    //diagonal backward
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
        if(chess[i][j]==1) {
            return false;
        }
    }//diagonal forward
    for(int i=row-1, j=col+1; i>=0 && j<chess.size(); i--,j++) {
        if(chess[i][j]==1) {
            return false;
        }
    }
    return true;
}
void printnqueens(vector<vector<int>> &chess, string path, int row) {
    if(row==chess.size()) {
        cout<<path<<"."<<endl;
        return;
    }
    for(int col=0; col<chess.size(); col++) {       //Square Matrix
        if(isSafe(chess,row,col)==true) {
            chess[row][col]=1;
            printnqueens(chess, path + to_string(row) + "-" + to_string(col) + ",", row+1);
            chess[row][col]=0;
        }
    }
}
int main() {
    int n; cin>>n;
    vector<vector<int>>chess(n,vector<int>(n,0));
    printnqueens(chess,"",0);

    return 0;
}

