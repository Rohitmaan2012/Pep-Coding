#include<iostream>
#include<vector>
#include<algorithm>
#include<limits.h>
using namespace std;

void display(vector<int> &arr) {
    for(int r: arr) {
        cout<<r<<" ";
    }
    cout<<endl;
}
void countsort(vector<int> &arr, int exp) {
    vector<int> farr(10,0);
    
    for(int i=0; i<arr.size(); i++) {
        int idx = arr[i]/exp % 10;
        farr[idx]++;
    }
    for(int i=1; i<farr.size(); i++) {
        farr[i] = farr[i] + farr[i-1];
    }
    vector<int> ans(arr.size(),0);

    for(int i=arr.size()-1; i>=0; i--) {
        int val = arr[i]/exp % 10;
        int pos = farr[val]-1;
        ans[pos] = arr[i];
        //idx--;
        farr[arr[i]/exp % 10]--;
    }
    for(int i=0; i<arr.size(); i++) {
        arr[i] = ans[i];
    }
}
void radixsort(vector<int> &arr) {
    int max = INT_MIN;
    for(int val: arr) {
        if(val>max) {
            max = val;
        }
    }
    int exp = 1;
    while(exp<=max) {
        countsort(arr,exp);
        exp = exp*10;
    }
}
int main() {
    int n; cin>>n;
    vector<int> arr(n,0);      //vector<int> arr = {5,12,234,7,9875};
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }
    radixsort(arr);
    display(arr);

    return 0;
}
