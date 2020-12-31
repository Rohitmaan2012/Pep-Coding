#include<iostream>
#include<vector>
#include<string>
using namespace std;

vector<string> getmazepathwithjumps(int sr, int sc, int dr, int dc) {
    if(sr==dr && sc==dc) {
        vector<string> bres;
        bres.push_back("");
        return bres;
    }
    vector<string> paths;

    //horizontal moves
    for(int ms=1; ms<=dc-sc; ms++) {
        vector<string> hpaths = getmazepathwithjumps(sr, sc + ms, dr, dc);
        for(string hpath: hpaths) {
            paths.push_back("h" + ms + hpath);
        }
    }
    //vertical moves
    for(int ms=1; ms<=dr-sr; ms++) {
        vector<string> vpaths = getmazepathwithjumps(sr + ms, sc, dr, dc);
        for(string vpath: vpaths) {
            paths.push_back("v" + ms + vpath);
        }
    }
    //diagonal moves
    for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++) {
        vector<string> dpaths = getmazepathwithjumps(sr + ms, sc + ms, dr, dc);
        for(string dpath: dpaths) {
            paths.push_back("d" + ms + dpath);
        }
    }
    return paths;
}

int main() {
    int n,m;
    cin>>n>>m;
    vector<string> result = getmazepathwithjumps(1,1,n,m);
    cout<<"[";
    for(int i=0; i<result.size()-1; i++) {
        cout<<result[i]<<", ";
    }
    cout<<result[result.size()-1]<<"]";

    return 0;
}