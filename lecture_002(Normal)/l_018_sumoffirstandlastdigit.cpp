#include<iostream>
using namespace std;

int sum(int n) {
    int lastDigit = n%10;
    while(n>=10) {
        n/=10;
    }
    int firstDigit = n;
    int sum = firstDigit+lastDigit;
    return sum; 
}

int main(int args, char**argv) {
    int n;
    cin>>n;
    cout<<sum(n);
    
    return 0;
}