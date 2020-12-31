#include<iostream>
#include<string>
using namespace std;

void display(string s) {
    for(int i=0; i<s.size(); i++) {
        cout<<s[i]+" ";
    }
    cout<<endl;
}
bool ispalindrome(string s) {
    int si = 0;
    int ei = s.size()-1;
    while(si<ei) {
        if(s[si] != s[ei]) {
            return false;
        }
        si++;
        ei--;
    }
    return true;
}
int main() {
    string s;
    cin>>s;
    cout<<ispalindrome(s)<<endl;

    return 0;
}