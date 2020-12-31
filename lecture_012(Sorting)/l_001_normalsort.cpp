#include<iostream>
#include<vector>
using namespace std;

void display(vector<int> &arr) {
    for (int r:arr) {        
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
void increasingorder(vector<int> &arr) {
    for(int i=0; i<arr.size()-1; i++) {
        for(int j=i+1; j<arr.size(); j++) {
            if(arr[i]>arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    display(arr);
}
void decreasingorder(vector<int> &arr) {
    for(int i=0; i<arr.size()-1; i++) {
        for(int j=i+1; j<arr.size(); j++) {
            if(arr[i]<arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    display(arr);
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    vector<int>arr(n,0);   
    input(arr); 
    increasingorder(arr);
    decreasingorder(arr); 

    return 0;                   
}
