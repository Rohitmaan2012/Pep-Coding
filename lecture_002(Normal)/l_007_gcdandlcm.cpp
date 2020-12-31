#include<iostream>
using namespace std;

void gcdandlcm(int a, int b) {
    int oa = a;
    int ob = b;
    while(a%b != 0) {
        int rem = a%b;
        a = b;
        b = rem;

    }
    cout<<"GCD: "<<b<<endl;
    cout<<"LCM: "<<(oa*ob)/b<<endl;
}
/* void gcdandlcm2(int a, int b, int c) {
    int oa = a;
    int ob = b;
    int oc = c;
    while(a%b != 0) {
        int rem1 = a%b;
        a = b;
        b = rem1;
    }
    while(c%b != 0) {
        int rem2 = c%b;
        c = b;
        b = rem2;
    }
    cout<<"GCD: "<<b<<endl;
} */

int main(int args, char**argv) {
    int a; int b;
    cin>>a>>b;
    gcdandlcm(a,b);
    //cin>>c;
    //gcdandlcm(a,b,c);
    
    return 0;
}