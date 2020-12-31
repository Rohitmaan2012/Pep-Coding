#include<iostream>
#include<vector>
#include<string>
using namespace std;

vector<string> codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
void printkpc(string ques, string ans) {
    if(ques.length()==0) {
        cout<<ans<<endl;
        return;
    }
    char ch = ques[0];
    string roq = ques.substr(1);

    string deep = codes[ch-'0'];
    for(int i=0; i<deep.length(); i++) {
        char option = deep[i];
        printkpc(roq,ans+option);
    }
}
int main() {
    string str;
    getline(cin,str);
    printkpc(str,"");

    return 0;
}