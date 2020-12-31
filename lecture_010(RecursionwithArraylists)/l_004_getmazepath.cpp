#include<iostream>
#include<vector>
#include<string>
using namespace std;

//sr = source row;
//sc = source column;
//dr = destination row;
//dc = destination column;
vector<string> getmazepath1(int sr, int sc, int dr, int dc) {
    if(sr>dr || sc>dc) {
        vector<string> bres;
        return bres;
    }
    if(sr==dr && sc==dc) {
        vector<string> bres;
        bres.push_back("");
        return bres;
    }
    vector<string> hpaths = getmazepath1(sr,sc+1,dr,dc);;
    vector<string> vpaths = getmazepath1(sr+1,sc,dr,dc);

    vector<string> paths;
    for(string path: hpaths) {
        paths.push_back("h"+path);
    }
    for(string path: vpaths) {
        paths.push_back("v"+path);
    }
    return paths;
}
vector<string> getmazepath2(int sr, int sc, int dr, int dc) {
    if(sr==dr && sc==dc) {
        vector<string> bres;
        bres.push_back("");
        return bres;
    }
    vector<string> hpaths;
    vector<string> vpaths;

    if(sc<dc) {
        hpaths = getmazepath2(sr,sc+1,dr,dc);
    }
    if(sr<dr) {
        vpaths = getmazepath2(sr+1,sc,dr,dc);
    }

    vector<string> paths;
    for(string path: hpaths) {
        paths.push_back("h"+path);
    }
    for(string path: vpaths) {
        paths.push_back("v"+path);
    }
    return paths;
}

int main() {
    int n,m;
    cin>>n>>m;
    vector<string> result = getmazepath2(1,1,n,m);
    cout<<"[";
    for(int i=0; i<result.size()-1; i++) {
        cout<<result[i]<<", ";
    }
    cout<<result[result.size()-1]<<"]";

    return 0;
}