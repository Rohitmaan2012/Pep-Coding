#include<iostream>

using namespace std;

int main(int args, char**argvs) {
    cout<<"Enter three values a,b and c:"<<endl;
    int a,b,c;
    cin>>a>>b>>c;
    if (a>b && a>c) {
        cout<<"a is greatest";
    }

    else if(b>a && b>c) {
        cout<<"b is greatest";
    }
    else {
        cout<<"c is greatest";
    } 
    return 0;       
} 