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
void wavetraversal(vector<vector<int>> &arr) {
    for(int j=0; j<arr[0].size(); j++) {
        if(j%2==0) {
            for(int i=0; i<arr.size(); i++) {
                cout<<arr[i][j]<<endl;
            }
        }
        else {
            for(int i=arr.size()-1; i>=0; i--) {
                cout<<arr[i][j]<<endl;
            }
        }
    }
}
void spiraldisplay(vector<vector<int>> &arr, int n, int m) {
    int minr = 0;
    int minc = 0;
    int maxr = arr.size()-1;
    int maxc = arr[0].size()-1;
    int total = n*m;
    int count = 0;

    while(count<total) {
        for(int i=minr, j=minc; i<=maxr && count<total; i++) {
            cout<<arr[i][j]<<endl;
            count++;
        }
        minc++;

        for(int j=minc, i=maxr; j<=maxc && count<total; j++) {
            cout<<arr[i][j]<<endl;
            count++;
        }
        maxr--;

        for(int i=maxr, j=maxc; i>=minr && count<total; i--) {
            cout<<arr[i][j]<<endl;
            count++;
        }
        maxc--;

        for(int j=maxc, i=minr; j>=minc && count<total; j--) {
            cout<<arr[i][j]<<endl;
            count++;
        }
        minr++;
    }
} 
void exitpoint(vector<vector<int>> &arr) {
    int dir = 0;
    int i = 0;
    int j = 0;

    while (i>=0 && j>=0 && i<arr.size() && j<arr[0].size()) {
        dir = (dir + arr[i][j]) % 4;
        if (dir == 0) {
            j++;
        } 
        else if (dir == 1) {
            i++;
        } 
        else if (dir == 2) {
            j--;
        } 
        else if (dir == 3) {
            i--;
        }
    }  
    if (i < 0) {
        i++;
        cout<<i<<endl;
        cout<<j<<endl;
    } 
    else if (j < 0) {
        j++;
        cout<<i<<endl;
        cout<<j<<endl;
    } 
    else if (i == arr.size()) {
        i--;
        cout<<i<<endl;
        cout<<j<<endl;
    } 
    else if (j == arr[0].size()) {
        j--;
        cout<<i<<endl;
        cout<<j<<endl;
    }    
}

int main() {
    int n,m;
    cin>>n>>m;
    vector<vector<int>>arr(n,vector<int>(m,0));
    input(arr);
    //wavetraversal(arr);
    //spiraldisplay(arr,n,m);
    exitpoint(arr);
}
