#include<iostream>
using namespace std;

void patternmirror(int n) {
    int nst=1;
    int nsp=n-1;
    for(int r=1; r<=n; r++) {
        for(int cst=1; cst<=nst; cst++) {
            cout<<"*";
        }
        for(int csp=1; csp<=nsp; csp++) {
            cout<<"-";
        }
        nst++;
        nsp--;
        cout<<endl;
    }
} 
int main(int args, char**argvs) {
    int n;
    cin>>n;
    patternmirror(n);
    return 0;
}