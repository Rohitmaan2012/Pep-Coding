#include<iostream>
using namespace std;

void fibonaccinumbertillN(int n) {
    int a = 0;
    int b = 1;
    for(int i=0; i<n; i++) {
        cout<<a<<" ";
        int c = a+b;
        a = b;
        b = c;
   }
   cout<<endl;
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    fibonaccinumbertillN(n);

    return 0;
}