#include<iostream>
#include<vector>
using namespace std;

void display(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[i].size(); j++) {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;   
    }
}
void input(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[i].size(); j++) {
            cin>>arr[i][j];
        }
    }
}
void wavetraversal(vector<vector<int>> &arr) {
    for(int j=0; j<arr[0].size(); j++) {
        if(j%2==0) {
            for(int i=0; i<arr.size(); i++) {
                cout<<arr[i][j]<<endl;
            }
        }
        else {
            for(int i=arr.size()-1; i>=0; i--) {
                cout<<arr[i][j]<<endl;
            }
        }
    }
}
int main() {
    int n,m;
    cin>>n>>m;
    vector<vector<int>>arr(n,vector<int>(m,0));
    input(arr);
    wavetraversal(arr);
}
