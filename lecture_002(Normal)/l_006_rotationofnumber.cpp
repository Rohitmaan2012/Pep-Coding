#include<iostream>
using namespace std;

int noofdigits(int n) {
    int count = 0;
    while(n!=0) {
        n/=10;
        count++;
    }
    return count;
}
void rotation(int n, int r) {
    int digit = noofdigits(n);
    r%=digit;
    r = r<0?r+digit:r;

    int mul=1;
    int div=1;

    for(int i=1; i<=digit; i++) {
        if(i<=r) {
            mul = mul*10;
        }
        else
            div = div*10;

    }
    int ans = (n%div)*mul + n/div;
    cout<<"Rotated Number: "<< ans<<endl;

}

int main(int args, char**argv) {
    int n; int r;
    cin>>n>>r;
    rotation(n,r);

    return 0;
}