#include<iostream>
#include<vector>
#include<string>
using namespace std;

void printsubsequence(string ques, string ans) {
    if(ques.length()==0) {
        cout<<ans<<endl;
        return;
    }
    char ch = ques[0];
    string roq = ques.substr(1);

    printsubsequence(roq,ans+"-");
    printsubsequence(roq,ans+ch);
}

int main() {
    string str;
    getline(cin,str);
    printsubsequence(str,"");

    return 0;
}