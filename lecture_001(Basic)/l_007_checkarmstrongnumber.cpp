#include<iostream>
#include<cmath>
using namespace std;

int armstrong(int n) {
	int sum = 0;
	while(n!=0) {
    	int l = n%10;
		sum = sum + pow(l,3);
		n/=10;
	}
	return sum;
}
int main() {
    int n;
    cin>>n;
    cout<<armstrong(n);
	
	return 0;
}
	
 


	
	
 

	
 


	
	
 
