#include<iostream>
#include<stack>
using namespace std;

void solution(stack<int> &st) {
    st.push(10);
    st.push(30);
    st.push(15);
    /* cout<<"[";
    for(int i=0; i<st.size()-1; i++) {
        cout<<st[i]<<", ";                    //error
    }
    cout<<st[st.size()-1]<<"]"<<endl; */
    cout<<"[";
    while(st.size()!=1) {
        cout<<st.top()<<", ";
        st.pop();
    }
    cout<<st.top()<<"]"<<endl;

    /* while(!st.empty()) {
        cout<<st.top()<<" ";       //gives toppest value in the stack
        st.pop();           //doesn't give toppest value , it just removes toppest value
    }
    cout<<endl; */

    st.push(20);
    cout<<st.top()<<endl;
}
int main() {
    stack<int> st;
    solution(st);

    return 0;
}