#include<iostream>
using namespace std;

void primefactorisation(int n) {
    for(int div =2; div <= n; div++)  {
        while(n%div == 0) {
            n /= div;
            cout<<div<<" ";
        }
    }
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    primefactorisation(n);

    return 0;
}