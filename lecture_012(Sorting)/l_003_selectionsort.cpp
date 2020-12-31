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
void selectionsort(vector<int> &arr) {
    for(int i=0; i<arr.size()-1; i++) {
        int min = i;
        for(int j=i+1; j<arr.size(); j++) {
            if(arr[min]>arr[j]) {
                min = j;
            }
        }
        swap(arr,i,min);
    }
    display(arr);
}

int main() {
    int n;
    cin>>n;
    vector<int>arr(n,0);   
    input(arr); 
    selectionsort(arr);

    return 0;                   
}
