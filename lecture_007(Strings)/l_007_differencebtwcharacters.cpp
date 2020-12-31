#include<iostream>
#include<string>
using namespace std;

string differencebtwchars(string s) {
    for(int i=0; i<s.length()-1; i++) {
        char r1 = s[i];
        char r2 = s[i+1];
        int diff = r2-r1;

        //s = s + r1;     (correct)
        //string diff = to_string(diff1);
        //s = s + diff; 
        
        s.append(i,r1);
        s.append(i,diff);
    }
    //s = s + s[s.length()-1];    (correct)
    //s.append(s[s.length()-1]);   (error)
    s.append(s.length()-1,s[s.length()-1]);
    return s;
}

int main() {
    string s;
    cin>>s;
    //togglecharacters(s);
    //modify1(s);
    cout<<differencebtwchars(s)<<endl;

    return 0;
}