#include<iostream>
#include<vector>
using namespace std;

void display(vector<vector<int>> &arr) {
     for(int row=0; row<arr.size(); row++)  {
        for(int col=0; col<arr[0].size(); col++) {
            cout<<arr[row][col]<<" ";
        }
        cout<<endl;
    }
}
void input(vector<vector<int>> &arr) {
    for(int row=0; row<arr.size(); row++)  {
        for(int col=0; col<arr[0].size(); col++) {
            cin>>arr[row][col];
        }
    }
    display(arr);
}
void addMatrix(vector<vector<int>> &arr, vector<vector<int>> &arr1) {
     for(int row=0; row<arr.size(); row++)  {
        for(int col=0; col<arr[0].size(); col++) {
            arr[row][col] += arr1[row][col];
        }
    }
    display(arr);
}    
int main(int args, char**argvs) {
    int n,m;
    cin>>n>>m;
    vector<vector<int>>arr(n,vector<int>(m,0));
    vector<vector<int>>arr1(n,vector<int>(m,0));
    input(arr);
    input(arr1);
    addMatrix(arr,arr1);
}
