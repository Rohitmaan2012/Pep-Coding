#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void display(vector<int> &arr) {
    for(int r: arr) {
        cout<<r<<" ";
    }
    cout<<endl;
}
void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
    display(arr);
}
void targetsumpair1(vector<int> &arr, int target) {
    sort(arr.begin(),arr.end());   
    int l = 0;
    int r = arr.size()-1;
    while(l<r) {
        if(arr[l]+arr[r]<target) {
            l++;
        }
        else if(arr[l]+arr[r]>target) {
            r--;
        }
        else {
            cout<<arr[l]<<","<<arr[r]<<endl;
            l++;
            r--;
        }
    }
}
int main() {
    int n; cin>>n;
    vector<int> arr(n,0);
    input(arr);
    int target; cin>>target;
    targetsumpair1(arr,target); 

    return 0;
}