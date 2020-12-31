#include<iostream>
#include<vector>
#include<string>
using namespace std;

void display(vector<string> &arr) {
    for(string r: arr) {
        cout<<r<<endl;
    }
    cout<<endl;
}
void countsort(vector<string> &arr, int div, int mod, int range) {
    vector<int> farr(range,0);
    	
    for(int i=0; i<arr.size(); i++) {
        int idx = stoi(arr[i],10)/div % mod;
        farr[idx]++;
    }
    for(int i=1; i<farr.size(); i++) {
        farr[i] = farr[i] + farr[i-1];
    }
    vector<string> ans(arr.size(),0);

    for(int i=arr.size()-1; i>=0; i--) {
        int val = stoi(arr[i],10)/div % mod;
        int pos = farr[val] - 1;
        ans[pos] = arr[i]; 
        farr[stoi(arr[i],10)/div % mod]--; 
    }

    for(int i=0; i<arr.size(); i++) {
        arr[i] = ans[i];
    }
}
void sortdates(vector<string> &arr) {
    countsort(arr,1000000,100,32);     //days
    countsort(arr,10000,100,13);       //months
    countsort(arr,1,10000,2501);       //years
}

int main() {
    int n; cin>>n;
    vector<string> srr;
    string str;
    for(int i=0; i<n; i++) {
        cin>>str;
        srr.push_back(str);
    }
    sortdates(srr);
    cout<<endl;
    display(srr);

    return 0;
}