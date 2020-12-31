#include<iostream>
#include<vector>
#include<string>
using namespace std;

//Global Array
vector<string> codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
vector<string> getkpc(string str) {
    if(str.length()==0) {
        vector<string> bres;
        bres.push_back("");
        return bres; 
    }
    char ch = str[0];
    string ros = str.substr(1);
    vector<string> rres = getkpc(ros);

    vector<string> myans;
    string deep = codes[ch-'0'];
    for(int i=0; i<deep.length(); i++) {
        char ch1 = deep[i];
        for(string rstr: rres) {
            myans.push_back(ch1+rstr);
        }
    }
    return myans;
}

int main() {
    string str;
    //cin>>str;
    getline(cin,str);
    vector<string> words = getkpc(str);
    cout<<"[";
    for(int i=0; i<words.size()-1; i++) {
        cout<<words[i]<<", ";
    }
    cout<<words[words.size()-1]<<"]";
    
    return 0;
}