#include<iostream>
#include<vector>
using namespace std;
void display(vector<int> &arr) {
    for (int i:arr) {         // for-each loop   //this loop works on value in index
        cout<<i<<" ";         
    }
    cout<<endl;
}
void input(vector<int> &arr) {   //void input(int n);
    for(int i=0; i<arr.size(); i++) {   //this loop work on index
        cin>>arr[i];
    }
    display(arr);
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    vector<int>arr(n,0);    //int n = scn.nextInt();
    input(arr);             //input(n);
    display(arr);           //display(n);

    return 0;
}
