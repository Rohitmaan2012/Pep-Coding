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
void quicksort(vector<int> &arr, int l, int h) {
	if(l>=h) {
		return;
	}                                //Recursion on the way up
	int p = arr[h];
	int pi= partitionarray(arr,p,l,h);
	quicksort(arr,l,pi-1);
	quicksort(arr,pi+1,h);
}
int main() {
    int n; cin>>n;
    vector<int> arr(n,0);
    input(arr);
    quicksort(arr,0,arr.size()-1);

	return 0;
}