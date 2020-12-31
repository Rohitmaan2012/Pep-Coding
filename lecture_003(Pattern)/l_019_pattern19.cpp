#include<iostream>
using namespace std;

void rajneeshpattern19(int n) {
    int nsp= n;
    for(int r=1; r<=n; r++) {
        for(int csp=1; csp<=nsp; csp++) {
            if(r==n/2+1 || csp==nsp/2+1 || r==1 || r==n || csp==1 || csp==nsp) {
                cout<<"*";
            }
            else {
            cout<<" ";
            } 
        }
        cout<<endl;
    }
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    rajneeshpattern19(n);
}