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
void swap(vector<int> &arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
void insertionsort(vector<int> &arr) {
    for(int i=1; i<arr.size(); i++) {
        for(int j=i-1; j>=0; j--) {
            if(arr[j]>arr[j+1]) {
                swap(arr,j,j+1);
            }
            else {
                break;
            }
        }  
    }
    display(arr);
}

int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);   
    input(arr); 
    insertionsort(arr);

    return 0;                   
}
