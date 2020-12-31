#include<iostream>
#include<vector>
using namespace std;
void display(vector<int>& arr) {
    for (int i:arr) {
        cout<<i<<" ";
    }
    cout<<endl;
}
void input1(vector<int>& a1) {
    for(int i=0; i<a1.size(); i++) {
        cin>>a1[i];
    }
}
void input2(vector<int>& a2) {
    for(int i=0; i<a2.size(); i++) {
        cin>>a2[i];
    }
}
void addition(vector<int> &a1, vector<int> &a2, vector<int> &sum) {
    int c= 0;
	int i = a1.size()-1;
	int j = a2.size()-1;
	int k = sum.size()-1;
    	
	while(k>=0) {
		int d = c;
    	if(i>=0) {
    		d = d+a1[i];
    	}
    	if(j>=0) {                //(l>=0)
    		d = d+a2[j];          //d=d+a2[l]
    	}
    	c = d/10;
    	d = d%10;
	    	
    	sum[k] = d;               
    	i--;
    	j--;                      //l--;
    	k--;
    }
	if(c!=0) {
		cout<<c<<" ";
	}
	display(sum);
}

int main() {
    int n1;
    cin>>n1;
    vector<int>a1(n1,0);
    input1(a1);
    int n2;
    cin>>n2;
    vector<int>a2(n2,0);
    input2(a2);
    vector<int>sum(n1>n2?n1:n2);
    addition(a1,a2,sum);

    return 0;
}

