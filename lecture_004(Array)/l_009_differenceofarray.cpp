#include<iostream>
#include<vector>
using namespace std;

void display(vector<int> &arr) {
    for(int r: arr) {
    	cout<<r<<" ";
    }
    cout<<endl;
}
void input1(vector<int> &a1) {
    for(int i=0; i<a1.size(); i++) {
    	cin>>a1[i];
    }
}
void input2(vector<int> &a2) {
    for(int j=0; j<a2.size(); j++) {
    	cin>>a2[j];
    }
}
void subtraction(vector<int> &a2, vector<int> &a1, vector<int> &diff) {
    int c= 0;
    int j = a2.size()-1;
    int i = a1.size()-1;
    int k = diff.size()-1;
        
    while(k>=0) {
    	int d = 0;
        int v = i>=0?a1[i]:0;
        /*if (i>=0) {
            a1[i] = a1[i];
        }
        else {
            a1[i] = 0;
        } */
    	if(a2[j]+c>=v) {
    		d = a2[j]+c-v;
			c=0;
    	}
    	else {
    	    d = a2[j]+c+10-v;
			c=-1;
           }
    	diff[k] = d;
    	i--;
    	j--;
    	k--;
    }
	int kv = 0;
	while(kv<diff.size()) {
		if(diff[kv]==0) {
			kv++;
		}
        else {
			break;
		}
    }
    while(kv<diff.size()) {
        cout<<diff[kv]<<" ";
        kv++;
	}
}
int main() {
    int n2; cin>>n2;
	vector<int>a2(n2,0);
	input2(a2);
	int n1; cin>>n1;
	vector<int>a1(n1,0);
	input1(a1);
	vector<int> diff(n2,0);
    subtraction(a2,a1,diff);

	return 0;
}

