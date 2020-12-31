#include<iostream>
#include<string>
using namespace std;

void printencodings(string ques, string ans) {
    if(ques.length()==0) {
        cout<<ans<<endl;
        return;
    }
    else if(ques.length()==1) {
        char ch = ques[0];
        if(ch=='0') {
            return;
        }
        else {
            int chv = ch-'0';
            char code = (char)('a' + chv - 1);
            cout<<ans+code<<endl;
        }
    }
    else {
        char ch = ques[0];
        string roq = ques.substr(1);
        if(ch=='0') {
            return;
        }
        else {
            int chv = ch-'0';
            char code = (char)('a' + chv - 1);
            printencodings(roq,ans+code);
        }
        
        string ch12 = ques.substr(0,2);
        string roq12 = ques.substr(2);
        
        int ch12v = stoi(ch12);
        if(ch12v <= 26) {
            char code = (char)('a' + ch12v - 1);
            printencodings(roq12,ans+code);
        }
    }
}
int main() {
    string str;
    cin>>str;
    printencodings(str,"");
}

