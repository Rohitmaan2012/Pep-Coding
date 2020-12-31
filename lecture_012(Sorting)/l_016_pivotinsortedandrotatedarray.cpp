#include<iostream>
#include<vector>
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
int pivotInSortedAndRotatedAarray(vector<int> &arr) {
    int l = 0;
    int h = arr.size()-1;
    while(l<h) {
        int mid = (l+h)/2;
        if(arr[mid]<arr[h]) {
            h = mid;
        }
        else {
            l = mid+1;
        }
    }
    return arr[l];
}
int main() {
    int n; cin>>n;
    vector<int> arr(n,0);
    input(arr);
    cout<<pivotInSortedAndRotatedAarray(arr)<<endl;

    return 0;
}