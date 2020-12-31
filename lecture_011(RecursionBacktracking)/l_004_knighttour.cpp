#include<iostream>
#include<vector>
#include<string>
using namespace std;

void display(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[0].size(); j++) {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
    cout<<endl;
}
void printknighttour(vector<vector<int>> &chess, int r, int c, int move) {
    if(r<0 || c<0 || r>=chess.size() || c>=chess.size() || chess[r][c]>0) {
        return;
    } 
    else if(move==chess.size()*chess.size()) {
        chess[r][c] = move;
        display(chess);
        chess[r][c] = 0;
        return;
    }
    chess[r][c] = move;
    printknighttour(chess,r-2,c+1,move+1);
    printknighttour(chess,r-1,c+2,move+1);
    printknighttour(chess,r+1,c+2,move+1);
    printknighttour(chess,r+2,c+1,move+1);
    printknighttour(chess,r+2,c-1,move+1);
    printknighttour(chess,r+1,c-2,move+1);
    printknighttour(chess,r-1,c-2,move+1);
    printknighttour(chess,r-2,c-1,move+1);
    chess[r][c] = 0;
}
int main() {
    int n, r, c;
    cin>>n>>r>>c;
    vector<vector<int>>chess(n,vector<int>(n,0));
    printknighttour(chess,r,c,1);

    return 0;
}