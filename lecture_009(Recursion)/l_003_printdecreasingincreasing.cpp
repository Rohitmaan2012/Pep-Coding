#include<iostream>
using namespace std;

void printdecreasingincreasing(int n) {
    if(n==0) {
        return;
    }
    cout<<n<<endl;
    printdecreasingincreasing(n-1);
    cout<<n<<endl;
}
int main() {
    int n; 
    cin>>n;
    printdecreasingincreasing(n);

    return 0;
}