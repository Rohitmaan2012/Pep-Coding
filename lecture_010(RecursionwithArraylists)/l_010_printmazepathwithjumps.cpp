#include<iostream>
#include<vector>
#include<string>
using namespace std;

void printmazepathwithjumps(int sr, int sc, int dr, int dc, string path) {
    if(sr==dr && sc==dc) {
        cout<<path<<endl;
        return;
    }
    for(int ms=1; ms<=dc-sc; ms++) {
        printmazepathwithjumps(sr, sc + ms, dr, dc, path + "h" + to_string(ms));
    }
    for(int ms=1; ms<=dr-sr; ms++) {
        printmazepathwithjumps(sr + ms, sc, dr, dc, path + "v" + to_string(ms));
    }
    for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++) {
        printmazepathwithjumps(sr + ms, sc + ms, dr, dc, path + "d" + to_string(ms));
    }
}
int main() {
    int n,m;
    cin>>n>>m;
    printmazepathwithjumps(1,1,n,m,"");
}