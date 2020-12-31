#include<iostream>
#include<vector>
using namespace std;

void display(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[i].size(); j++) {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}
void input(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[i].size(); j++) {
            cin>>arr[i][j];
        }
    }
}
void matrixmultiplication1(vector<vector<int>> &prd, vector<vector<int>> &one, vector<vector<int>> &two, int c1, int r2) {
    if(c1=r2) {
        for(int i=0; i<prd.size(); i++) {
            for(int j=0; j<prd[i].size(); j++) {
                for(int k=0; k<c1; k++) {
                    prd[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        display(prd);
    }
    else {
        cout<<"Invalid input"<<endl;
    }
}
vector<vector<int>> &matrixmultiplication2(vector<vector<int>> &prd, vector<vector<int>> &one, vector<vector<int>> &two, int c1, int r2) {
    if(c1=r2) {
        for(int i=0; i<prd.size(); i++) {
            for(int j=0; j<prd[i].size(); j++) {
                for(int k=0; k<c1; k++) {
                    prd[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        display(prd);
    }
}

int main() {
    int r1,c1;
    cin>>r1>>c1;
    vector<vector<int>>one(r1,vector<int>(c1,0));
    input(one);
    int r2,c2;
    cin>>r2>>c2;
    vector<vector<int>>two(r2,vector<int>(c2,0));
    input(two);
    vector<vector<int>>prd(r1,vector<int>(c2,0));
    matrixmultiplication1(prd,one,two,c1,r2);
    //matrixmultiplication2(prd,one,two,c1,r2);
}