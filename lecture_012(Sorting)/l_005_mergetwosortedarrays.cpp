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
vector<int> mergetwosortedarrays(vector<int> &arr, vector<int> &one, vector<int> &two) {
    int i=0;
    int j=0;
    int k=0;
    while(i<one.size() && j<two.size()) {
        if(one[i]>two[j]) { 
            arr[k] = two[j];
            j++; 
            k++;
        }
        else if(one[i]<two[j]) {
            arr[k] = one[i];
            i++;
            k++;
        }
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

int main() {
    int n1; cin>>n1;
    vector<int> one(n1,0);
    input(one);
    int n2; cin>>n2;
    vector<int> two(n2,0);
    input(two);;
    vector<int> arr(one.size()+two.size(),0);
    vector<int> result = mergetwosortedarrays(arr,one,two);
    display(result);

    return 0;                   
}
