#include<iostream>
using namespace std;

int sumdivisible(int a, int b) {
    int sum = 0;
    for(int n=a; n<=b; n++) {
        if(n%3==0 && n%5==0) {
            sum = sum + n;
        }
    }
    return sum;
}
int main(int args, char**argv) {
    int a,b;
    cin>>a>>b;
    cout<<sumdivisible(a,b)<<endl;
    
    return 0;
}