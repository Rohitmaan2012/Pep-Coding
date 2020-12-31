#include<iostream>
using namespace std;

void pzz(int n) {
    if(n==0) {
        return;
    }
    cout<<"Pre "<<n<<endl;
    pzz(n-1);
    cout<<"In "<<n<<endl;
    pzz(n-1);
    cout<<"Post "<<n<<endl;
}
int main() {
    int n;  
    cin>>n;
    pzz(n);

    return 0;
}