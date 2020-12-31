#include<iostream>
using namespace std;

int getDifference(int n1, int n2, int b) {
    int rv = 0;
    int p = 1;
    int c= 0;
    while(n2>0) {
        int d1 = n1%10;
        int d2 = n2%10;
        
        n1/=10;
        n2/=10;

        int d = 0;
        if(d2+c>=d1) {
            d = d2+c-d1;
            c=0;
        }
        else {
            d = d2+b+c-d1;
            c=-1;
        }
        rv= rv+d*p;
        p*=10;
    }
    return rv;
}
int main() {
    int n2, n1, b;
    cin>>n2>>n1>>b;
    cout<<getDifference(n1,n2,b)<<endl;

    return 0;
}