#include<iostream>
using namespace std;

int getValueInDecimal(int n, int b) {
    int p = 1;
    int dn = 0;
    while(n>0) {
        int digit = n%10;
        dn += digit*p;
        p = p*b;
        n/=10;
    }
    return dn;
}
int main() {
    int n,b;
    cin>>n>>b;
    cout<<getValueInDecimal(n,b)<<endl;

    return 0;
}
