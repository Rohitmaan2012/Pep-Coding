#include<iostream>
#include<vector>
using namespace std;

void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
}
int lastIndex(vector<int> &arr, int idx, int x) {
    if(idx==arr.size()) {
        return -1;
    }
    int liisa = lastIndex(arr,idx+1,x);
    if(liisa==-1) {
        if(arr[idx]==x) {
            return idx;
        }
        else {
            return -1;
        }
    }
    else {
        return liisa;
    }
}
int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    int d;
    cin>>d;
    int li = lastIndex(arr,0,d);
    cout<<li<<endl;

    return 0;
}