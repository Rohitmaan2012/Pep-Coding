#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int inverseofnumber(int n) {
    int inv=0;
    int op=1;
    while(n!=0) {
        int od = n % 10;
        int id = op;
        int ip = od;

        inv = inv + id * pow(10, ip-1);

        n/=10;
        op++;  
    }
    return inv;
}
int main(int args,char**argv) {
    int n;
    cin>>n;
    cout<<"Inverse Number: "<< inverseofnumber(n)<<endl;

    return 0;
}
