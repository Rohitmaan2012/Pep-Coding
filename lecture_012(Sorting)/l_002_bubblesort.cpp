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
int swap(vector<int> &arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
vector<int> bubblesort(vector<int> &arr) {
    for(int i=1; i<arr.size(); i++) {
        for(int j=0; j<arr.size()-i; j++) {
            if(arr[j]>arr[j+1]) {
                swap(arr,j,j+1);
            }
        }
    }
    return arr;
}
int main() {
    int n;
    cin>>n;
    vector<int> arr(n,0);
    input(arr);
    bubblesort(arr);
    vector<int> brr = bubblesort(arr);
    display(brr);

    return 0;
}
