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
vector<vector<int>> transposeofmatrix1(vector<vector<int>> &arr) {  //for square and non-square matrix
    	vector<vector<int>> hell(arr[0].size(),vector<int>(arr.size(),0));
    	for(int i=0; i<arr[0].size(); i++) {
    		for(int j=0; j<arr.size(); j++) {
    			hell[i][j] = arr[j][i];
    		}
    	}
    	return hell;
    }
vector<vector<int>> transposeofmatrix2(vector<vector<int>> &arr) {  //for square matrix
    for(int i=0; i<arr.size(); i++) {
        for(int j=i; j<arr[0].size(); j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
    return arr;
}
vector<vector<int>> rotateby90degreeclockwise(vector<vector<int>> &arr) {
    vector<vector<int>> brr = transposeofmatrix1(arr);
    for(int i=0; i<brr.size(); i++) {
        int sj = 0;
        int ej = brr[i].size()-1;

        while(sj<ej) {
            int temp = brr[i][sj];
            brr[i][sj] = brr[i][ej];
            brr[i][ej] = temp;
            sj++;
            ej--;
        }
    }
    return brr;
}
vector<vector<int>> rotateby90degreeanticlockwise(vector<vector<int>> &arr) {
    vector<vector<int>> brr = transposeofmatrix1(arr);
    for(int j=0; j<brr[0].size(); j++) {
        int si = 0;
        int ei = brr.size()-1;

        while(si<ei) {
            int temp = brr[si][j];
            brr[si][j] = brr[ei][j];
            brr[ei][j] = temp;
            si++;
            ei--;
        }
    }
    return brr;
}

int main() {
    int n,m;
    cin>>n>>m;
    vector<vector<int>>arr(n,vector<int>(n,0));
    input(arr);
    //wavetraversal(arr);
    //spiraldisplay(arr,n,m);
    //exitpoint(arr);
    //transposeofmatrix1(arr);
    //transposeofmatrix2(arr);
    //rotateby90degreeclockwise(arr);
    vector<vector<int>> hell = rotateby90degreeanticlockwise(arr);
    display(hell);
}
