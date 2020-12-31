#include<iostream>
#include<vector>
using namespace std;
void display(vector<int>& arr) {
    for (int i:arr) {
        cout<<i<<" ";
    }
    cout<<endl;
}
void input(vector<int>& arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
    display(arr);
}
int maximum(vector<int>& arr) {
    int max=arr[0];
    for(int i=0;i<arr.size(); i++) {
        if (arr[i]>max) {
            max=arr[i];
        }
    }
    return max;
}
int minimum(vector<int>& arr) {
    int min=arr[0];
    for(int i=0; i<arr.size(); i++) {
        if (arr[i]<min) {
            min=arr[i];
        }  
    }
    return min;
}
void barchart(vector<int> &arr) {
    int max1 = maximum(arr);
    for(int r=max1; r>=1; r--) {
        for(int i=0; i<arr.size(); i++) {
            if(arr[i]>=r) {
                cout<<"*\t";
            }
            else {
                cout<<"\t";
            }
        }
        cout<<endl;
    }
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    //display(arr);
    //maximum(arr);
    //minimum(arr);
    barchart(arr);

    return 0;
}
