#include<iostream>
using namespace std;

void rajneeshpattern18(int n) {
    int nst = n;
    int nsp = 0;
    for(int r=1; r<=n; r++) {
        for(int csp=1; csp<=nsp; csp++) {
            cout<<" ";
        }
        for(int cst=1; cst<=nst; cst++) {
            if(r<=n/2 && r>1 && cst>1 && cst<nst) {
                cout<<" ";
            }
            else
            cout<<"*";
        }
        if(r<=n/2) {
            nst-=2;
            nsp++;
        }
        else {
            nst+=2;
            nsp--;
        }
        cout<<endl;
    }
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    rajneeshpattern18(n);
}
