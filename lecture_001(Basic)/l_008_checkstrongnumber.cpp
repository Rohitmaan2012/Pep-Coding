#include<iostream>
using namespace std;
	
int factorial(int n) {
	int fact = 1;
	for(int i=1; i<=n; i++) {
		fact = fact*i;
	}
	return fact;
}
void strong(int n) {
	int sum = 0;
    int p = n;
	while(n!=0) {
		int l = n%10;
	    int k = factorial(l);
		sum = sum + k;
		n/=10;
	}
    if(p==sum) {
        cout<<p<<" is a strong number"<<endl;
    }
    else {
        cout<<p<<" is not a strong number"<<endl;;
    }
}
int main() {
    int n;
    cin>>n;
    strong(n);

	return 0;
}
		
	
 


	
	
 
