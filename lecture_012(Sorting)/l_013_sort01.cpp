#include<iostream>
#include<vector>
using namespace std;

void display(vector<int> &arr) {
    for(int r: arr) {
        cout<<r<<" ";
    }
    cout<<endl;
}
void input(vector<int> &arr) {
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
vector<int> partitionsort01(vector<int> &arr) {
	int i=0;
	int j=0;
	while(i<arr.size()) {
		if(arr[i]==1) {
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
    vector<int> result = partitionsort01(arr);
    display(result);

	return 0;
}