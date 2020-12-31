#include<iostream>
using namespace std;

/*void rajneeshpattern7(int n) {
    int nst = 1;
    int nsp = 0;
    for(int r=1; r<=n; r++) {
        for(int csp=1; csp<=nsp; csp++) {
            cout<<" ";
        }
        for(int cst=1; cst<=nst; cst++) {
            cout<<"*";
        }
        nsp++;
        cout<<endl;
    }
}*/

void sumeetpattern7(int n) {
    for(int r=1; r<=n; r++) {
        for(int cst=1; cst<=r; cst++) {
            if(r==cst) {
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
    //rajneeshpattern7(n);
    sumeetpattern7(n);
    return 0;
}