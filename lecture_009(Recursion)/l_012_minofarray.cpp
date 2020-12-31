#include<iostream>
#include<vector>
using namespace std;

void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
}
int minofarray(vector<int> &arr, int idx) {
    if(idx==arr.size()-1) {
        return arr[idx];
    }
    int misa = minofarray(arr,idx+1);
    if(misa<arr[idx]) {
        return misa;
    }
    else {
        return arr[idx];
    }
}
int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    int min = minofarray(arr,0);
    cout<<min<<endl;

    return 0;
}