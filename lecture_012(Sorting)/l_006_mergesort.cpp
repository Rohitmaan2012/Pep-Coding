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
vector<int> mergetwosortedarrays(vector<int> &one, vector<int> &two) {
    vector<int> arr(one.size()+two.size(),0);
    int i=0;
    int j=0;
    int k=0;
    while(i<one.size() && j<two.size()) {
        if(one[i]>two[j]) { 
            arr[k] = two[j];
            j++; 
        }
        else if(one[i]<two[j]) {
            arr[k] = one[i];
            i++;
        }
        k++;
    }
    while(i<one.size()) {
        arr[k] = one[i];
        i++;
        k++;
    }
    while(j<two.size()) {
        arr[k] = two[j];
        j++;
        k++;
    }
    return arr;
}
vector<int> mergesort(vector<int> &arr, int l, int h) {
    if(l==h) {
        vector<int> base(1,0);
        base[0] = arr[l];
        return base; 
    }
    int m = (l+h)/2;
    vector<int> brr = mergesort(arr,l,m);
    vector<int> crr = mergesort(arr,m+1,h);
    vector<int> ans = mergetwosortedarrays(brr,crr);
    return ans;
}

int main() {
    int n; cin>>n;
    vector<int> arr(n,0);
    input(arr);
    vector<int> result = mergesort(arr,0,arr.size()-1);
    display(result);
    
    return 0;                   
}
