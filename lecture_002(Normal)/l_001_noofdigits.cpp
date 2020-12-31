#include<iostream>
using namespace std;
int main(int args, char**argvs) {
    int num,count=0;
    cout<<"Enter a number:";
    cin>>num;
    while(num != 0) {

        num=num/10;
        count++;

    }
    cout<<"No.of digits:";
    cout<<count;
    
    return 0;
}