#include<iostream>
#include<string>
using namespace std;

string consecutivechars(string s) {
    for(int i=0; i<s.size(); i++) {
        char r = s[i];
        if(i%2==0) {
            r = (char)(r-1);
        }
        else {
            r = (char)(r+1);
        }
        s[i]=r;             
    }
    return s;
}
int main() {
    string s;
    cin>>s;
    cout<<consecutivechars(s)<<endl;

    return 0;
}