#include<iostream>
using namespace std;

bool sum(int n) {
	int sum = 0;
	for(int div=1; div<=n/2; div++) {
		if(n%div==0) {
			sum = sum + div;
		}
	}
	if(sum==n) {
		return true;
	}
	else {
		return false;
	}	
}
int main() {
    int n;
    cin>>n;
    if(sum(n)) {
        cout<<n<<" is a perfect number\n";
    }
    else {
        cout<<n<<" is not a perfect number\n";
    }
	return 0;
}

