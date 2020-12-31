#include<iostream>
#include<vector>
using namespace std;

bool checkPrime(int n) {
	for(int div=2; div*div<=n; div++) {
    	if(n%div==0) {
    		return false;
		}
	}
	return true;
}
vector<int> removeprimes(vector<int> a1) {
    for(int i=a1.size()-1; i>=0; i--) {
		int val = a1[i];
    	if(checkPrime(val)==true) {
    		a1.erase(a1.begin()+i);
        }
    }
    return a1;
}
int main() {
    int n;
    cin>>n;
    vector<int> a1(n,0);
    for(int i=0; i<n; i++) {
        cin>>a1[i];
    }
    for(int i=0; i<n; i++) {
        cout<<a1[i]<<" ";
    }
    cout<<endl;
    vector<int> result = removeprimes(a1);
    for(int i=0; i<result.size(); i++) {
        cout<<result[i]<<" ";
    }
}