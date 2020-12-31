#include<iostream>
#include<vector>
using namespace std;

void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
}
//Approach Rohit
void displayarr(vector<int> &arr, int n) {
    if(n==-1) {
        return;
    }
    displayarr(arr,n-1);
    cout<<arr[n]<<endl;
}

int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    displayarr(arr,n-1);

    return 0;
}