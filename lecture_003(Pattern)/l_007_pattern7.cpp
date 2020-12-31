#include<iostream>
using namespace std;

void patterndiamondnumber2(int n){
    int nst=1;
    int nsp=n/2;
    int num=0;  
    for (int r=1; r<=n; r++) { 
        for (int csp=1; csp<=nsp; csp++) {
           cout<<" ";
        }
        for (int cst=1; cst<=nst; cst++) {
            num++;
            cout<<num;
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
    patterndiamondnumber2(n);
    return 0;
}