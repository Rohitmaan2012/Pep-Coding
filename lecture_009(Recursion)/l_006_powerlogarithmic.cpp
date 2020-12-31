#include<iostream>
using namespace std;

int power(int x, int n) {
    int xn = 0;
    if(n==0) {
        return 1;
    }
    int xnd2 = power(x,n/2);
    if(n%2 == 0) {
        xn = xnd2*xnd2;
    }
    else {
        xn = xnd2*xnd2*x;
    }
    return xn;
}

int main() {
    int x,n;
    cin>>x>>n;
    int xn = power(x,n);
    cout<<xn<<endl;

    return 0;
}