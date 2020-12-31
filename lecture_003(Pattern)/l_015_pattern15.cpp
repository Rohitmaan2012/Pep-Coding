#include<iostream>
using namespace std;

void rajneeshpattern6(int n) {
    int nst = n/2+1;
    int nsp = 1;
    for(int r=1; r<=n; r++) {
        for(int cst=1; cst<=nst; cst++) {
            cout<<"*";
        }
        for(int csp=1; csp<=nsp; csp++) {
            cout<<" ";
        }
        for(int cst=1; cst<=nst; cst++) {
            cout<<"*";
        }

        if(r<=n/2) {
            nsp+=2;
            nst--;
        }
        else
        { 
            nsp-=2;
            nst++;
        }
        cout<<endl;
    }
}

/*void sumeetpattern6(int n) {
    for(int r=1; r<=n; r++) {
        for(int cst=1; cst<=n; cst++) {
            if(r==cst || r+cst==n+1) {
                cout<<"*";
            }
            else
                cout<<" "; 
        }
        cout<<endl;
    }
}*/
int main(int args, char**argv) {
    int n;
    cin>>n;
    rajneeshpattern6(n);
    //sumeetpattern6(n);
    return 0;
}