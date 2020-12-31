#include<iostream>
using namespace std;

void rajneeshpattern17(int n) {
    int nst = 1;
    int nsp = n/2;
    for(int r=1; r<=n; r++) {
        for(int csp=1; csp<=nsp; csp++) {
            if(r == n/2+1) {
                cout<<"*";
            }
            else {
            cout<<" ";
            }
        }
        for(int cst=1; cst<=nst; cst++) {
            cout<<"*";
        }
        if(r<=n/2) {
            nst++;
        }
        else {
            nst--;
        }
        cout<<endl;
    }
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    rajneeshpattern17(n);
}