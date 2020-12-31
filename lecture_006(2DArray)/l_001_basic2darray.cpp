#include<iostream>
#include<vector>
using namespace std;

void display(vector<vector<int>> &arr, int n, int m) {
    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}
void input(vector<vector<int>> &arr, int n, int m) {
    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            cin>>arr[i][j];
        }
    }
    display(arr,n,m);
}
int main() {
    int n,m;
    cin>>n>>m;
    vector<vector<int>>arr(n,vector<int>(m,0));       //vector<int>arr(n,0);
    input(arr,n,m);
}