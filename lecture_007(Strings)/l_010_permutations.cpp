#include<iostream>
#include<string>
using namespace std;

int factorial(int n) {
    int fact = 1;
    for(int i=2; i<=n; i++) {
        fact *= i;
    }
    return fact;
}
void permutations(string s) {
    int n = s.length();
    int f = factorial(n);
    for(int i=0; i<f; i++) {
        string str = s;
        int temp = i;
        for(int div=n; div>=1; div--) {
            int q = temp/div;
            int r = temp%div;

            cout<<str[r];
            str.erase(str.begin()+r);

            temp = q;
        }
        cout<<endl;
    }
}
int main() {
    string s;
    cin>>s;
    permutations(s);

    return 0;
}