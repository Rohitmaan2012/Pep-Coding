#include<iostream>
#include<string>
using namespace std;

void compress1(string s) {
    int count = 1;
    for(int i=0; i<s.size()-1; i++) {
        char r1 = s[i];
        char r2 = s[i+1];
        if(r1 != r2) {
            cout<<r1;
            if(count>1) {
                cout<<count; 
            }
            count=1;
        }
        else {
            count++;
        }
    }
    cout<<s[s.size()-1];
    if(count>1) {
        cout<<count;
    }
}
string compress2(string s) {
	string sb;	
    int count = 1;
    for(int i=0; i<s.length()-1; i++) {
        char r1 = s[i];
        char r2 = s[i+1];
        if(r1 != r2) {
            sb = sb + r1;
            sb = sb + to_string(count);
            count=0;
        }
        count++;
    }
    sb += s[(s.length()-1)];
    sb += to_string(count);
    return sb;
}
int main() {
    string s;
    cin>>s;
    //cout<<compress1(s);
    cout<<compress2(s);

    return 0;
}