#include<iostream>
using namespace std;

void rajneeshpattern16(int n) {
    int nst = 1;
    int nsp = 2*n-3;      // n+1 is a not the correct initial value 
    for(int r=1; r<=n; r++) {
        int val = 1;
        for(int cst=1; cst<=nst; cst++) {
            cout<<val;
            val++;
        }
        for(int csp=1; csp<=nsp; csp++) {
            cout<<" ";
        }
        if(r==n) {
            nst--;
            val--;
        }
        for(int cst=1; cst<=nst; cst++) {
            val--;
            cout<<val;
        }
        nst++;
        nsp-=2;
        cout<<endl;
    }
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    rajneeshpattern16(n);
}