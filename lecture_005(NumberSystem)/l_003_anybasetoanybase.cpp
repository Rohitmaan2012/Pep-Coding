#include<iostream>
using namespace std;

int anyBaseToDecimal(int n, int b) {
    int p = 1;
    int rv = 0;
    while(n!=0) {
        int digit = n%10;
        rv += digit*p;
        p = p*b;
        n/=10;
    }
    return rv;
}
int decimalToAnyBase(int n, int b) {
    int p = 1;
    int rv = 0;
    while(n!=0) {
        int digit = n%b;
        rv += digit*p;
        p = p*10;
        n/=b;
    }
    return rv;
}
int main() {
    int n1,b1,b2;
    cin>>n1>>b1>>b2;
    int decimal = anyBaseToDecimal(n1, b1);
    int dn = decimalToAnyBase(decimal,b2);
    cout<<dn<<endl;

    return 0;
}
