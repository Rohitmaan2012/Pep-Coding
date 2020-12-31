#include<iostream>
using namespace std;

void patternbinomial(int n) {
    int nst = 1;
    for(int r=0; r<n; r++) {
        int val =1;
        for(int cst=0; cst<nst; cst++) {
            cout<<val;
            val = (val*(r-cst))/(cst+1);
        }
        nst++;
        cout<<endl;
    }
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    patternbinomial(n);
}