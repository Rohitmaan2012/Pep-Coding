#include<iostream>
using namespace std;

int main(int args, char**argvs) {
    int n,limit;
    cin>>n>>limit;
    for(int i=1; i<=limit; i++) {
        cout<<n<<"*"<<i<<":"<<n*i<<endl;
    }
    return 0;
}