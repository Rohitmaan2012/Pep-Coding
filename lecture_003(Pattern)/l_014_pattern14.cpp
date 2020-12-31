#include<iostream>
using namespace std;

void rajneeshpattern10(int n) {
    int nsp = n/2;
    int is = -1;
    for(int r=1; r<=n; r++) {
        for(int csp=1; csp<=nsp; csp++) {
            cout<<" ";
        }
        cout<<"*";
        for(int isp=1; isp<=is; isp++) {
            cout<<" ";
        }
        if(r>1 && r<n) {
            cout<<"*";
        }

        if(r<=n/2) {
            nsp--;
            is+=2;
        }
        else
        { 
            is-=2;
            nsp++;
        }
        cout<<endl;
    }
}

/*void sumeetpattern10(int n) {
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
    rajneeshpattern10(n);
    //sumeetpattern10(n);
    return 0;
}