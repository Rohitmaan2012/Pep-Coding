#include<iostream>
using namespace std;

int power(int x, int n) {
    if(n==0) {
        return 1;
    }
    int xnm1 = power(x,n-1);
    int xn = x*power(x,n-1);   
    return xn;
}
int main() {
    int x,n;  
    cin>>x>>n;
    int xn = power(x,n);
    cout<<xn<<endl;

    return 0;
}