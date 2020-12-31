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
vector<int> partitionarray1(vector<int> &arr, int p) {
	vector<int> sol(arr.size(),0);
	int k=0;
	for(int i=0; i<arr.size(); i++) {
		if(arr[i]<=p) {
			sol[k]= arr[i];
			k++;
		}
	}
	for(int i=0; i<arr.size(); i++) {
		if(arr[i]>p) {
			sol[k] = arr[i];
			k++;
		}
	}
	return sol;
}
void swap(vector<int> &arr, int i ,int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
vector<int> partitionarray2(vector<int> &arr, int p) {
	// i to end   ->   unknown
	// j to i-1   ->   >pivot
	// 0 to j-1   ->   <=pivot
	int i=0;
	int j=0;
	while(i<arr.size()) {
		if(arr[i]>p) {
			i++;
		}
		else {
			swap(arr,i,j);
			i++;
			j++;
		}
	}
	return arr;
}
int main() {
    int n; cin>>n;
    vector<int> arr(n,0);
    input(arr);
    int p; cin>>p;
    vector<int> result1 = partitionarray1(arr,p);
    vector<int> result2 = partitionarray2(arr,p);
    display(result1);
    display(result2);

	return 0;
}