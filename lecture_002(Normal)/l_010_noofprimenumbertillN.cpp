#include<iostream>
using namespace std;

int primenumbertilln() {
    cout<<"Enter the two numbers: ";
    int low; int high;
    cin>>low>>high;
    cout<<"Prime Numbers between two numbers are: ";
    int count = 0;
    for(int n=low; n<=high; n++) {
        bool flag = false;
        for(int div =2; div*div <= n; div++) {
            if(n%div == 0) {
                flag = true;
                break;
            } 
        }
        if(flag == false) {
            count++; 
        }
    }
    return count;
}
int main(int args, char**argv) {
    cout<<primenumbertilln();

    return 0;
}