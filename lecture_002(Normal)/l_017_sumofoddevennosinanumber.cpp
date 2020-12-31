#include<iostream>
using namespace std;

int sum(int n) {
    int sumOdd = 0;
    int sumEven = 0;
    while(n!=0) {
        int lastDigit = n%10;
        if(lastDigit%2==0) {
            sumEven = sumEven + n%10;
        }
        else {
            sumOdd = sumOdd + n%10;
        }
        n/=10;
    }
    return sumOdd;
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    cout<<sum(n);
    
    return 0;
}