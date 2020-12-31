#include<iostream>
#include<string>
using namespace std;

string togglecharacters(string s) {
    for(int i=0; i<s.size(); i++) {
        char r = s[i];
        if(r>='a' && r<='z') {
            r = (char)(r-'a'+'A');
        }
        else {
            r = (char)(r-'A'+'a');
        }
        s[i]=r;              
    }
    return s;
}

int main() {
    string s;
    cin>>s;
    cout<<togglecharacters(s)<<endl;

    return 0;
}