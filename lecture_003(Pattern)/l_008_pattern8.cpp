#include<iostream>
using namespace std;

void patterndiamondnumber3(int n){
    int nst=1;
    int nsp=n/2;  
    for (int r=1; r<=n; r++) { 
        for (int csp=1; csp<=nsp; csp++) {
           cout<<" ";
        }
        int val = r;
        if(r>n/2) {
            val = n-r+1;
        }
        for (int cst=1; cst<=nst; cst++) {
            cout<<val;
            if(cst<=nst/2) {
                val++;
            }
            else
                val--;
        }
        if (r<=n/2) {
            nsp--;
            nst+=2; 
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
    patterndiamondnumber3(n);
    return 0;
}