#include<iostream>
using namespace std;

int getValueInBase(int n, int b) {
    int p = 1;
    int dn = 0;
    while(n!=0) {
        int digit = n%b;
        dn += digit*p;
        p = p*10;
        n/=b;
    }
    return dn;
}
int main() {
    int n,b;
    cin>>n>>b;
    cout<<getValueInBase(n,b)<<endl;

    return 0;
}

