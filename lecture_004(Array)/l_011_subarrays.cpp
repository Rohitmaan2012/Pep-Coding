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
void maximum(vector<int> &arr) {
    int max = arr[0];
    for(int i=1; i<arr.size(); i++) {
        if(arr[i]>=max) {
            max = arr[i];
        }
    }
    cout<<"Maximum: "<<max<<endl;
}
void minimum(vector<int> &arr) {
    int min = arr[0];
    for(int i=1; i<arr.size(); i++) {
        if(arr[i]<=min) {
            min = arr[i];
        }
    }
    cout<<"Minimum: "<<min<<endl;
}
bool find(vector<int> &arr, int data) {
    for(int ele: arr) {
        if(ele==data) {
            return true;
        }
    }
    return false;
}
void swap(vector<int> &arr, int i, int j) {

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    //display(arr);
}
void reverse(vector<int> &arr, int si, int ei) {
    while(si<ei) {
        swap(arr,si,ei);
        si++;
        ei--;
    }
    //display(arr);
}
void rotate1(vector<int> &arr, int r) {
    r%=arr.size();
    r = r<0?r+arr.size():r;
    vector<int>ans(arr.size(),0); 
    int k=0;
    for(int i=r; i<arr.size(); i++) {
        ans[k] = arr[i];
        k++;
    }
    for(int i=0; i<r; i++) {
        ans[k] = arr[i];
        k++;
    }
    display(ans);
}
void rotate2(vector<int> &arr, int r) {
    r%=arr.size();
    r = r<0?r+arr.size():r;
    reverse(arr,0,r-1);
    reverse(arr,r,arr.size()-1);
    reverse(arr,0,arr.size()-1);
    display(arr);
}
void subarrays(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=i; j<arr.size(); j++) {
            for(int k=i; k<=j; k++) {
                cout<<arr[k]<<" ";
            }
            cout<<endl;
        }
    }
}

int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    //display(arr);
    //maximum(arr);
    //minimum(arr);
    //cout<<find(arr,34)<<endl;
    //swap(arr,0,2);
    //reverse(arr,0,n-1);
    //int r;
    //cin>>r;
    //rotate1(arr,r);
    //rotate2(arr,r);
    subarrays(arr);

    return 0;
}