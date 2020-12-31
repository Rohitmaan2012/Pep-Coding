#include<iostream>
#include<vector>
using namespace std;

void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
}
int maxofarray(vector<int> &arr, int idx) {
    if(idx==arr.size()-1) {
        return arr[idx];
    }
    int misa = maxofarray(arr,idx+1);
    if(misa>arr[idx]) {
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
    int max = maxofarray(arr,0);
    cout<<max<<endl;

    return 0;
}