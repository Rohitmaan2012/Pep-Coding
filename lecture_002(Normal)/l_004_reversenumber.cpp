#include<iostream>
using namespace std;
int main(int args, char**argvs) {
    int num, rev=0;
    cout<<"Enter a number:";
    cin>>num;
    while(num != 0) {
        rev = rev*10 + num % 10;
        num /= 10;

    }
    cout<<"Reverse number is:"<<rev<<endl;
    
    return 0;
}