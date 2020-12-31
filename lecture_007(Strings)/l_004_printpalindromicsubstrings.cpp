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
void printpalindromicsubstrings(string s) {
    for(int i=0; i<s.size(); i++) {
        for(int j=1; j<=s.size()-i; j++) {
            string v = s.substr(i,j);
            //check whether this substring is palindrome or not
            bool palindromic = ispalindrome(v);
            if(palindromic==true) {
                cout<<v<<endl;
            }
        }
    }
}
int main() {
    string s;
    cin>>s;
    //cout<<ispalindrome(s)<<endl;
    printpalindromicsubstrings(s);

    return 0;
}