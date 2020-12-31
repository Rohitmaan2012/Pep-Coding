#include<iostream>
#include<string>
using namespace std;

void solution(string str) {
    //Add(Normal)
    str = str + 'w';
    str = str + "mc";
    cout<<str<<endl;

    //Add(Java)
    str.append("g");
    cout<<str<<endl;

    //Get
    char ch = str[0];
    cout<<ch<<endl;

    //Insert
    str.insert(2,"y");
    cout<<str<<endl;

    //Replace
    str[0] = 'd';
    cout<<str<<endl;

    //Delete(Normal)
    str.erase(2,4);
    cout<<str<<endl;

    //Delete(Java)
    str.erase(str.begin()+1);
    cout<<str<<endl;

    //Time Complexity -> O(n) -> right
    //Time Complexity -> O(n^2) -> wrong
    /* long start = System.currentTimeMillis();
    int n = 10000;
    string s = "";
    for(int i=0; i<=n; i++) {
        s += i;
    }
    long end = System.currentTimeMillis();
    long duration = end - start;
    System.out.println(duration); */
}

int main() {
    string str = "Hello";
    solution(str);

    return 0;
}