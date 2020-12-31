#include<iostream>
using namespace std;

void patterndiamondnumber(int n){
    int nst=1;
    int nsp=n/2;
    int num=1; 
    for (int r=1; r<=n; r++) {
        for (int csp=1; csp<=nsp; csp++) {
           cout<<" ";
        }
        for (int cst=1; cst<=nst; cst++) {
            cout<<num;
        }
        if(r<=n/2) {
            nst+=2;
            nsp--;
        }
        else {
            nst-=2;
            nsp++;
        }
        num++;
        cout<<endl;
    }
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    patterndiamondnumber(n);
    return 0;
}