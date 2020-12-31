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
vector<int> partitionsort012(vector<int> &arr) {
	// i to k     ->  unknown
    // k+1 to end ->  2's area 
    // j to i-1   ->  1's area
    // 0 to j-1   ->  0's area
    int i=0;
    int j=0;
    int k = arr.size()-1;
    while(i<=k) {
        if(arr[i]==0) {
            swap(arr,i,j);
            i++;
            j++;
        }
        else if(arr[i]==1) {
            i++;
        }
        else {
            swap(arr,i,k);
            k--;
        }
    }
	return arr;
}
int main() {
    int n; cin>>n;
    vector<int> arr(n,0);
    input(arr);
    vector<int> result = partitionsort012(arr);
    display(result);

    return 0;
}