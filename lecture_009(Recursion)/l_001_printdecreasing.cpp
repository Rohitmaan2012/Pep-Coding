#include<iostream>
using namespace std;

void printdecreasing(int n) {
    if(n==0) {
        return;
    }
    cout<<n<<endl;
    printdecreasing(n-1);
}
int main() {
    int n; 
    cin>>n;
    printdecreasing(n);

    return 0;
}