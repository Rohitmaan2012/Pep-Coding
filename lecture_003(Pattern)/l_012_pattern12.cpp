#include<iostream>
using namespace std;

/*void rajneeshpattern8(int n) {
    int nst = 1;
    int nsp = n-1;
    for(int r=1; r<=n; r++) {
        for(int csp=1; csp<=nsp; csp++) {
            cout<<" ";
        }
        for(int cst=1; cst<=nst; cst++) {
            cout<<"*";
        }
        nsp--;
        cout<<endl;
    }
}*/

void sumeetpattern8(int n) {
    for(int r=1; r<=n; r++) {
        for(int cst=1; cst<=n; cst++) {
            if(r+cst==n+1) {
                cout<<"*";
            }
            else
                cout<<" "; 
        }
        cout<<endl;
    }
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    //rajneeshpattern8(n);
    sumeetpattern8(n);
    return 0;
}