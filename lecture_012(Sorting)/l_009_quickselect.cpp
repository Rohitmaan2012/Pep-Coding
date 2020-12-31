#include<iostream>
#include<vector>
using namespace std;

void display(vector<int> &arr) {
    for(int r: arr) {
        cout<<r<<" ";
    }
    cout<<endl;
}
void input(vector<int>& arr) {
    for(int i=0; i<arr.size(); i++) {
        cin>>arr[i];
    }
    display(arr);
}
void swap(vector<int> &arr, int i ,int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
int partitionarray(vector<int> &arr, int p, int l, int h) {
	int i=l;
	int j=l;
	while(i<=h) {
		if(arr[i]>p) {
			i++;
		}
		else {
			swap(arr,i,j);
			i++;
			j++;
		}
	}
	return j-1;
}
int quickselect(vector<int> &arr, int l, int h, int k) {                        
	int p = arr[h];
	int pi= partitionarray(arr,p,l,h);

    if(k>pi) {
        return quickselect(arr,pi+1,h,k);
    }
    else if(k<pi) {
        return quickselect(arr,l,pi-1,k);
    }
    else {
        return arr[pi];
    }
}

int main() {
    int n; cin>>n;
    vector<int> arr(n,0);
    input(arr);
    int k; cin>>k;
    cout<<quickselect(arr,0,arr.size()-1,k-1)<<endl;

    return 0;
}