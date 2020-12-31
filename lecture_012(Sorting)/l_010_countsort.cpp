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
void countsort(vector<int> &arr, int min, int max) {
    int range = max-min+1;
    vector<int> farr(range,0);
    
    for(int i=0; i<arr.size(); i++) {
        int idx = arr[i]-min;
        farr[idx]++;
    }
    farr[0]--;
    for(int i=1; i<farr.size(); i++) {
        farr[i] = farr[i] + farr[i-1];
    }
    vector<int> ans(arr.size(),0);
    for(int i=arr.size()-1; i>=0; i--) {
        int val = arr[i];
        int idx = farr[val-min];
        ans[idx] = val;
        //idx--;
        farr[val-min]--;
    }
    for(int i=0; i<arr.size(); i++) {
        arr[i] = ans[i];
    }
}
int main() {
    int n; cin>>n;
    vector<int> arr(n,0);    //vector<int> arr = {9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
    int min = INT_MAX;
    int max = INT_MIN;
    for(int i=0; i<n; i++) {
        cin>>arr[i];
        min = min_element(min,arr[i]);
        max = max_element(max,arr[i]);
    }
    countsort(arr,min,max);
    display(arr);

    return 0;
}
