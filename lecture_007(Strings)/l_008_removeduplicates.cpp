#include<iostream>
#include<string>
using namespace std;

void removeduplicates(string s) {
    for(int i=0; i<s.size()-1; i++) {
        char r1 = s[i];
        char r2 = s[i+1];
        if(r1 != r2) {
            cout<<r1;
        }
    }
    cout<<s[s.size()-1];
}

int main() {
    string s;
    cin>>s;
    removeduplicates(s);

    return 0;
}
