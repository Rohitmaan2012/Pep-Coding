#include<iostream>
#include<vector>
using namespace std;

void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
}
void display(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cout<<arr[i]<<endl;
    }
}
vector<int> allIndices(vector<int> &arr, int idx, int x, int fsf) {
    if(idx==arr.size()) {
        return vector<int>(fsf,0);
    }
    if(arr[idx]==x) {
        vector<int>iarr = allIndices(arr,idx+1,x,fsf+1);
        iarr[fsf] = idx;
        return iarr;
    }
    else {
        vector<int>iarr = allIndices(arr,idx+1,x,fsf);
        return iarr;
    }
}
int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    int d;
    cin>>d;
    vector<int>ai = allIndices(arr,0,d,0);
    display(ai);

    return 0;
}