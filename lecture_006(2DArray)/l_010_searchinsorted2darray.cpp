#include<iostream>
#include<vector>
using namespace std;

void display(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[0].size(); j++) {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}
void input(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[0].size(); j++) {
            cin>>arr[i][j];
        }
    }
    display(arr);
}
void searchinsorted2darray(vector<vector<int>> &arr, int data) {
    int i = 0;
    int j = arr[0].size()-1;

    while(i<arr.size() && j>=0) {
        if(data<arr[i][j]) {
            j--;
        }
        else if(data>arr[i][j]) {
            i++;
        }
        else {
            cout<<i<<","<<j<<endl;
            return;
        }
    }
    cout<<"Not Found"<<endl;
}
int main() {
    int n;
    cin>>n;
    vector<vector<int>>arr(n,vector<int>(n,0));       //vector<int>arr(n,0);
    input(arr);
    int data;
    cin>>data;
    searchinsorted2darray(arr,data);
}