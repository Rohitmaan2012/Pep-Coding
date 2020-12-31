#include<iostream>
#include<vector>
#include<string>
using namespace std;

void printstairspath(int n, string path) {
    if(n==0) {
        cout<<path<<endl;
        return;
    }
    else if(n<0) {
        return;
    }
    printstairspath(n-1,path+"1");
    printstairspath(n-2,path+"2");
    printstairspath(n-3,path+"3");
}

int main() {
    int n;
    cin>>n;
    printstairspath(n,"");

    return 0;
}