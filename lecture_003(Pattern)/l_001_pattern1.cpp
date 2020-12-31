#include<iostream>
using namespace std;
int main(int args, char**argvs) {
    int n;
    cin>>n;
    int nst=1;
    int nsp=n-1;  //n-1=4
    for (int r=1; r<=n; r++) { //no. of rows
        for (int csp=1; csp<=nsp; csp++) {   //count of spaces
            cout<<"-";
        }
        for (int cst=1; cst<=nst; cst++) {   //count of stars
            cout<<"*";
        }
        nsp--;
        nst++; 
        cout<<endl;
        }
        return 0;
    }