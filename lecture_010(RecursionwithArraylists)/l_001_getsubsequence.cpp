#include<iostream>
#include<vector>
#include<string>
using namespace std;

vector<string> getss(string str) {
    if(str.length()==0) {
        vector<string> bres;
        bres.push_back("");
        return bres;
    }
    char ch = str[0];    //a
    string ros = str.substr(1);  //bc
    vector<string> rres = getss(ros);

    vector<string> myans;
    for(string rstr: rres) {
        myans.push_back("-"+ rstr);
    }
    for(string rstr: rres) {
        myans.push_back(ch+ rstr);
    }
    return myans;
}
int main() {
    string str;
    //cin>>str;
    getline(cin,str);
    vector<string> result = getss(str);
    cout<<"[";
    for(int i=0; i<result.size()-1; i++) {
        cout<<result[i]<<", ";
    }
    cout<<result[result.size()-1]<<"]";

    return 0;
}
