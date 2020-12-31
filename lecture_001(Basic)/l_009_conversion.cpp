#include<iostream>
#include<string>
using namespace std;

int main() {
    //String to an Integer
    string str;
    getline(cin,str);  
    int i = stoi(str);
    cout<<i<<endl;

    //Integer to a string
    int m;
    cin>>m;
    string s = to_string(m);
    cout<<s<<endl;
}