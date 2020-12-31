#include<iostream>
#include<vector>
#include<string>
using namespace std;

void printmazepath1(int sr, int sc, int dr, int dc, string path) {
    if(sr>dc || sc>dc) {
        return;
    }
    if(sr==dr && sc==dc) {
        cout<<path<<endl;
        return;
    }
    printmazepath1(sr,sc+1,dr,dc,path+"h");
    printmazepath1(sr+1,sc,dr,dc,path+"v");    
}
void printmazepath2(int sr, int sc, int dr, int dc, string path) {
    if(sr==dr && sc==dc) {
        cout<<path<<endl;
        return;
    }
    if(sc<dc) {
        printmazepath2(sr,sc+1,dr,dc,path+"h");
    }
    if(sr<dr) {
        printmazepath2(sr+1,sc,dr,dc,path+"v");
    }
}
int main() {
    int n,m;
    cin>>n>>m;
    printmazepath2(1,1,n,m,"");
}