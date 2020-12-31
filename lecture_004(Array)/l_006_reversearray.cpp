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
    while(si<=ei) {
        swap(arr,si,ei);
        si++;
        ei--;
    }
    display(arr);
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
    reverse(arr,0,n-1);

    return 0;
}