#include<iostream>
#include<string>
using namespace std;

void displaychar(string s) {
    for(int i=0; i<s.size(); i++) {
        cout<<s[i]<<" ";
    }
    cout<<endl;
}
void displaysubstrings(string s) {
    for(int i=0; i<s.size(); i++) {
        for(int j=1; j<=s.size()-i; j++) {
            cout<<s.substr(i,j)<<endl;
        }
    }
}
int main() {
    string s;
    cin>>s;
    cout<<s<<endl;
    displaychar(s);
    //displaysubstrings(s);

    return 0;
}
