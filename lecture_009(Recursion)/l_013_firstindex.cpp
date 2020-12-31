#include<iostream>
#include<vector>
using namespace std;

void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
}
int firstIndex(vector<int> &arr, int idx, int x) {
    if(idx==arr.size()) {
        return -1;
    }
    //Long approach
    int fiisa = firstIndex(arr,idx+1,x);
    if(arr[idx]==x) {
        return idx;
    }
    else {
        return fiisa;
    }
}
int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    int d;
    cin>>d;
    int fi = firstIndex(arr,0,d);
    cout<<fi<<endl;

    return 0;
}