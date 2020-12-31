#include<iostream>
using namespace std;

void patterndiamondnumber1(int n){
    int nst=1;
    int nsp=n/2;
    for (int r=1; r<=n; r++) {
        for (int csp=1; csp<=nsp; csp++) {
           cout<<" ";
        }
        int val = r;
        if(r>=n/2+1) {
            val = n-r+1;
        }
        for (int cst=1; cst<=nst; cst++) {
            cout<<val;
        }
        if(r<=n/2) {
            nst+=2;
            nsp--;
        }
        else {
            nst-=2;
            nsp++;
        }
        cout<<endl;
    }
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    patterndiamondnumber1(n);
    return 0;
}