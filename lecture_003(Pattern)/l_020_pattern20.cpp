#include<iostream>
using namespace std;

void rajneeshpattern20(int n) {
    int nst=n;
    for(int r=1; r<=n; r++) {
        for(int cst=1; cst<=nst; cst++) {
            if(cst==1 || cst==nst) {
                cout<<"*";
            }
            else if(r>n/2) {                       
                if(r==cst || r+cst==n+1) {
                    cout<<"*";
                }
                else
                {
                    cout<<" ";
                }
            }
            else
            cout<<" ";
        }
        cout<<endl;
    }
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    rajneeshpattern20(n);
}