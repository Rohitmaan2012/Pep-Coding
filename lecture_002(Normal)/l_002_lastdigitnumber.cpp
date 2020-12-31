#include<iostream>
using namespace std;
int main(int args, char**argvs) {
    int num;
    cout<<"Enter a number:";
    cin>>num;
    num %= 10;
    cout<<"Last digit number is:"<<endl;
    cout<<num;
    
    return 0;
}
