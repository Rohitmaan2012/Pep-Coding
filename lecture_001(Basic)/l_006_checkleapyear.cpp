#include<iostream>
using namespace std;

bool leapyear(int n) {
	if(n%400==0) {
		return true;
	}
	else if(n%100==0) {
		return false;
	}
	else if(n%4==0) {
		return true;
	}
	else {
		return false;
	}
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    if(leapyear(n)) {
        cout<<n<<" is a leap year"<<endl;
    }
    else {
        cout<<n<<" is not a leap year"<<endl;
    }
	return 0;
}