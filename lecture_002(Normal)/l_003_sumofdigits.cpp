#include<iostream>
using namespace std;
int main(int args, char**argvs) {
    int num, sum=0;
    cout<<"Enter a number:";
    cin>>num;
    while(num != 0) {
        sum= sum + num % 10;
        num /= 10;
        
    }
    cout<<"Sum of digits:";
    cout<<sum;
    
    return 0;
}