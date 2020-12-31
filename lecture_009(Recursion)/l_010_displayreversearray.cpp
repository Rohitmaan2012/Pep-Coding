#include<iostream>
#include<vector>
using namespace std;

void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
}
//Approach Rohit
void displayarrreverse(vector<int> &arr, int n) {
    if(n==-1) {
        return;
    }
    cout<<arr[n]<<endl;
    displayarrreverse(arr,n-1);
}

int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    displayarrreverse(arr,n-1);

    return 0;
}