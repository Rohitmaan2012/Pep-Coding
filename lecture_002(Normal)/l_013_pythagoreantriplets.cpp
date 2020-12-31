#include<iostream>
using namespace std;

void pythagoreantriplets(int a, int b, int c) {
    int hypotenuse = a;
    if(b>=hypotenuse) {
        hypotenuse = b;
    }
    if(c>=hypotenuse) {
        hypotenuse = c;
    }
    bool flag = false;
    if(hypotenuse == a) {
        if((b * b + c * c) == (a * a)) {
        	flag = true;
        }
        cout<<flag;
    } 
    else if(hypotenuse == b) {
        if((a * a + c * c) == (b * b)) {
            flag = true;
        }
        cout<<flag;
    } 
    else {
        if((a * a + b * b) == (c * c)) {
            flag = true;
        }
        cout<<flag;
    }
}
int main(int args, char**argv) {
    int a,b,c;
    cin>>a>>b>>c;
    pythagoreantriplets(a,b,c);
    
    return 0;
}