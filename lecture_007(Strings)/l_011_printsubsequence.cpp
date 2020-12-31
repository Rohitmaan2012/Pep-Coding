#include<iostream>
#include<string>
using namespace std;

void printsubsequence(string s) {
    for(int i=0; i< (1<<s.size()); i++) {
        for(int j=s.size()-1; j>=0; j--) {
            int mask = 1<<j;
            if( (i&mask) != 0 ) {
                cout<<s[s.size()-1-j];
            }
            else {
                cout<<"-";
            }
        }
        cout<<endl;
    }
}
int main() {
    string s;
    cin>>s;
    printsubsequence(s);

    return 0;
}