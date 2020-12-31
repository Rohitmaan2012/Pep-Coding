#include<iostream>
using namespace std;

void benjaminbulbs(int n) {   //n=no. of bulbs or no. of fluctuations
    cout<<"Bulbs that would be switched on are: ";
    int count = 0;
    for(int i=1; i*i<=n; i++) {
        cout<<i*i<<endl;
        count++;
    }
    cout<<"No of bulbs that would be switched on are: "<<count<<endl;
}
int main(int args, char**argv) {
    int n;
    cin>>n;
    benjaminbulbs(n);
    
    return 0;
}
