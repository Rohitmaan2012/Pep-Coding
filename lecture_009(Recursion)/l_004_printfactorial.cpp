#include<iostream>
using namespace std;

int factorial(int n) {
    if(n==1) {
        return 1;
    }
    int fn = n*factorial(n-1);    //Rohit Method
    return fn;
}
int main() {
    int n; 
    cin>>n;
    cout<<factorial(n)<<endl;

    return 0;
}