#include<iostream>
#include<vector>
#include<string>
using namespace std;

vector<string> getstairspath(int n) {
    if(n==0) {
        vector<string> bres;
        bres.push_back("");
        return bres;
    }
    else if(n<0) {
        vector<string> bres;
        return bres;
    }
    vector<string> paths1 = getstairspath(n-1);
    vector<string> paths2 = getstairspath(n-2);
    vector<string> paths3 = getstairspath(n-3);

    vector<string> paths;
    for(string path: paths1) {
        paths.push_back("1" + path);
    }
    for(string path: paths2) {
        paths.push_back("2" + path);
    }
    for(string path: paths3) {
        paths.push_back("3" + path);
    }
    return paths;
}

int main() {
    int n;
    cin>>n;
    vector<string> result = getstairspath(n);
    cout<<"[";
    for(int i=0; i<result.size()-1; i++) {
        cout<<result[i]<<", ";
    }
    cout<<result[result.size()-1]<<"]";

    return 0;
}