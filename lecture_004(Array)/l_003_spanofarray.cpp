#include<iostream>
#include<vector>
using namespace std;
void display(vector<int> &arr) {
    for (int i:arr) {
        cout<<i<<" ";
    }
    cout<<endl;
}
void input(vector<int> &arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
    display(arr);
}
int maximum(vector<int> &arr) {
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
void span(vector<int> &arr) {
    int max1 = maximum(arr);
    int min1 = minimum(arr);
    cout<<"Span: "<<(max1-min1)<<endl;	
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    //display(arr);
    //maximum(arr);
    //minimum(arr);
    span(arr);

    return 0;
}
