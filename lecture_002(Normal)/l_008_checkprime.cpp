#include<iostream>
using namespace std;

void isprime(int n) {
    bool flag = false;           // 1 = True
    for(int div=2; div*div<=n; div++) {
        if(n%div == 0) {
            flag = true;        // 0 = False
            break;
        }
    }
    if(flag==false) {
        cout<<n<<" is a prime number"<<endl;
    }
    else
        cout<<n<<" is not a prime number"<<endl;
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    isprime(n);

    return 0;
}