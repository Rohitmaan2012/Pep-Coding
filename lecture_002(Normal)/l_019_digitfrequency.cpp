#include<iostream>
using namespace std;

int digitfrequency(int n, int a) {
    int count = 0;
    while(n!=0) {
        if(n%10==a) {
            count++;
        }
        n/=10;
    }
    return count;
}
    
int main(int args,char**argv) {
    int n,a;
    cin>>n>>a;
    cout<<"Digit Frequency: "<<digitfrequency(n,a)<<endl;

    return 0;
}
