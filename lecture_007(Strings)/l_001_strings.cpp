#include<iostream>
#include<vector>
#include<string>
using namespace std;

int main() {
    // string s;
    // getline(cin,s);
    // cout<<"Hello "<<s<<" Welcome to my you tube channel"<<endl;

    // char r = s[2];
    // cout<<s.append(s);

    /*cout<<s.size()<<endl;     //string length

    cout<<s[1]<<endl;         //s[] 

    cout<<s.substr(2,4)<<endl;
    cout<<s.substr(2,3)<<endl;
    cout<<s.substr(2,2)<<endl;
    cout<<s.substr(1,1)<<endl;
    cout<<s.substr(2,1)<<endl;
    cout<<s.substr(2,0)<<endl;
    cout<<s.substr(2)<<endl; */

    string s1 = "Hello";
    s1 = s1 + ' ';
    s1 = s1 + 'w';
    s1 = s1 + 'o';
    cout<<s1<<endl;

    cout<<"hello"<<10<<20<<endl;
    cout<<10+20<<"hello"<<endl;

    string s2 = "abc, def, ghi, jkl mno";
    vector<string> paths = s2.split(", ");
    
    /* string s  = "Hello";
    char ch = 'w';
    string k = "nine";
    int n = 23;
    string m = to_string(n);
    s = s + m;
    cout<<s<<endl; */ 

    return 0;
}