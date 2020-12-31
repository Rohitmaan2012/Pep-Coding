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
bool binarySearch(vector<int> &arr, int data) {
    int l = 0;
    int h = arr.size()-1;
    
    while(l<=h) {
        int m = (l+h)/2;
        if(data<arr[m]) {
            h = m-1;
        }
        else if(data>arr[m]) {
            l = m+1;
        }
        else {
            cout<<m<<endl;
            return true;
        }
    } 
    return false;            
}
void firstindex(vector<int> &arr, int data) {
    int l = 0;
    int h = arr.size()-1;
    int fi = 0;
    
    while(l<=h) {
        int m = (l+h)/2;
        if(data<arr[m]) {
            h = m-1;
        }
        else if(data>arr[m]) {
            l = m+1;
        }
        else {
            fi = m;
            h = m-1;
        }
    } 
    cout<<"First: "<<fi<<endl;          
}
void lastindex(vector<int> &arr, int data) {
    int l = 0;
    int h = arr.size()-1;
    int li = 0;
    
    while(l<=h) {
        int m = (l+h)/2;
        if(data<arr[m]) {
            h = m-1;
        }
        else if(data>arr[m]) {
            l = m+1;
        }
        else {
            li = m;
            l = m+1;
        }
    } 
    cout<<"Last: "<<li<<endl;          
}
   
int main(int args, char**argvs) {
    int n; cin>>n;
    vector<int>arr(n,0);
    input(arr);
    int data; cin>>data;
    //cout<<binarySearch(arr,data)<<endl;
    firstindex(arr,data);
    lastindex(arr,data);

    return 0;
}

     