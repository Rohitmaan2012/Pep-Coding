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
void diagonaltraversal(vector<vector<int>> &arr) {
    for(int g=0; g<arr.size(); g++) {
        for(int j=g, i=0; j<arr[0].size(); j++,i++) {
            cout<<arr[i][j]<<endl;
        }
    }
}
void saddlepoint(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        int minvalj = 0;
        for(int j=0; j<arr[0].size(); j++) {
            if(arr[i][j]<arr[i][minvalj]) {
                minvalj = j;
            }
        }
        bool flag = true;
        for(int k=0; k<arr.size(); k++) {
            if(arr[k][minvalj]>arr[i][minvalj]) {
                flag = false;
                break;
            }
        }
        if(flag == true) {
            cout<<"Saddle Point: "<<arr[i][minvalj]<<endl;
            return;
        }
    }
    cout<<"Invalid Input"<<endl;
}
int main() {
    int n;
    cin>>n;
    vector<vector<int>>arr(n,vector<int>(n,0));
    input(arr);
    //diagonaltraversal(arr);
    saddlepoint(arr);
}