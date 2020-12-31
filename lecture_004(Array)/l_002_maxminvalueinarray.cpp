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
}
void maximum(vector<int>& arr) {
     int max=arr[0];
     for(int i=0;i<arr.size(); i++) {
         if (arr[i]>max) {
             max=arr[i];
         }
     }
     cout<<"Maximum value:"<<max<<endl;
}
void minimum(vector<int>& arr) {
    int min=arr[0];
    for(int i=0; i<arr.size(); i++) {
        if (arr[i]<min) {
            min=arr[i];
        }  
    }
    cout<<"Minimum value:"<<min<<endl; 
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    vector<int>arr(n,0);
    input(arr);
    display(arr);
    maximum(arr);
    minimum(arr);

    return 0;
}
