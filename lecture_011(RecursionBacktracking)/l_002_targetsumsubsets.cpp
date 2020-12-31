#include<iostream>
#include<vector>
#include<string>
using namespace std;

void printtargetsumsubsets(vector<int> &arr, int idx, string set, int sos, int tar) {
    if(idx==arr.size()) {
        if(sos==tar) {
            cout<<set<<"."<<endl;
        }
        return;
    }
    printtargetsumsubsets(arr,idx+1,set+to_string(arr[idx])+",",sos+arr[idx],tar);
    printtargetsumsubsets(arr,idx+1,set,sos,tar);
}
int main() {
    int n; cin>>n;
    vector<int>arr(n,0);
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
    int tar; cin>>tar;
    printtargetsumsubsets(arr,0,"",0,tar);

    return 0;
}