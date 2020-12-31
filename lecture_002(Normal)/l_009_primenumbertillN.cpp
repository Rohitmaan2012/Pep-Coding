#include<iostream>
using namespace std;

void primenumbertilln() {
    cout<<"Enter the two numbers: ";
    int low; int high;                  
    cin>>low>>high;                                          //cin>>high>>low;
    cout<<"Prime Numbers between two numbers are: ";
    for(int n=low; n<=high; n++) {                           //for (int n=high; n>=low; n--)
        bool flag = false;
        for(int div =2; div*div <= n; div++) {
            if(n%div == 0) {
                flag = true;
                break;
            } 
        }
        if(flag == false) {
            cout<<n<<" "; 
        }
    }
}
int main(int args, char**argv) {
    primenumbertilln();

    return 0;
}