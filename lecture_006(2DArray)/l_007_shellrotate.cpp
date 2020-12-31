#include<iostream>
#include<vector>
using namespace std;

void display(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[0].size(); j++) {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;   
    }
}
void input(vector<vector<int>> &arr) {
    for(int i=0; i<arr.size(); i++) {
        for(int j=0; j<arr[0].size(); j++) {
            cin>>arr[i][j];
        }
    }
}
void reverse(vector<int> &oned, int si, int ei) {
		while(si<ei) {
			int temp = oned[si];
			oned[si] = oned[ei];
			oned[ei] = temp;
			si++;
			ei--;
		}
	}
vector<int>fillonedfromshell(vector<vector<int>> &arr, int s) {
	int minr = s-1;
	int minc = s-1;
	int maxr = arr.size()-s;
	int maxc = arr[0].size()-s;
    /*size = (lw + bw + rw + tw)-4;
	   = [(maxr-minr+1)+(maxc-minc+1)+(maxr-min+1)+(maxc-minr+1)]-4; 
       = [2(maxr-minr+1)+2(maxc-minc+1)]-4;
       = 2maxr-2minr+ 2 +2maxc-2minc+ 2 - 4;
       = 2(maxr-minr+maxc-minc); */		 
	int size = 2 * (maxr-minr + maxc-minc);
	int idx =0;
    vector<int>oned(size,0); 
		 
	for(int i=minr,j=minc; i<=maxr; i++) {
		oned[idx] = arr[i][j];
		idx++;
	}
	minc++;
		 
	for(int j=minc,i=maxr; j<=maxc; j++) {
		oned[idx] = arr[i][j];
		idx++;
	}
	maxr--;
		 
	for(int i=maxr,j=maxc; i>=minr; i--) {
		oned[idx] = arr[i][j];
		idx++;
	}
	maxc--;
		 
	for(int j=maxc,i=minr; j>=minc; j--) {
		oned[idx] = arr[i][j];
		idx++;
	}
	minr++;
		 
	return oned;
}
void rotate(vector<int> &oned, int r) {
	r %= oned.size();
	r = r<0?r+oned.size():r;
		 
	reverse(oned,0,r-1);          
    reverse(oned,r,oned.size()-1);       
    reverse(oned,0,oned.size()-1);  
}
	 
void fillshellwithoned(vector<vector<int>> &arr, int s, vector<int> &oned) {
	int minr = s-1;
	int minc = s-1;
	int maxr = arr.size()-s;
	int maxc = arr[0].size()-s;
		 
	int idx = 0;
	for(int i=minr,j=minc; i<=maxr; i++) {
		arr[i][j] = oned[idx];
			idx++;
	}
	minc++;
		 
	for(int j=minc,i=maxr; j<=maxc; j++) {
		arr[i][j] = oned[idx];
		idx++;
	}
	maxr--;
		 
	for(int i=maxr,j=maxc; i>=minr; i--) {
		arr[i][j] = oned[idx];
		idx++;
	}
	maxc--;
		 
	for(int j=maxc,i=minr; j>=minc; j--) {
		arr[i][j] = oned[idx];
		idx++;
	}
	minr++;
}

void shellRotate(vector<vector<int>> &arr, int s, int r) {
		vector<int>oned = fillonedfromshell(arr,s);
		rotate(oned,r);
		fillshellwithoned(arr,s,oned);
}

int main() {
    int n,m;
    cin>>n>>m;
    vector<vector<int>>arr(n,vector<int>(m,0));
    input(arr);
    int s,r;
    cin>>s>>r;
	shellRotate(arr,s,r);
	display(arr);
}
