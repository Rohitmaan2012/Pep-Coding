#include<iostream>
#include<vector>
#include<deque>
using namespace std;

void rightSolution(deque<int> &que) {
    que.push_back(10);
    que.push_back(20);
    que.push_back(30);
    cout<<"[";
    for(int i=0; i<que.size()-1; i++) {
        cout<<que[i]<<", ";
    }
    cout<<que[que.size()-1]<<"]"<<endl; 

    que.push_front(5);
    cout<<"[";
    for(int i=0; i<que.size()-1; i++) {
        cout<<que[i]<<", ";
    }
    cout<<que[que.size()-1]<<"]"<<endl;

    cout<<que[0]<<endl;

    cout<<que[que.size()-1]<<endl;

    que.pop_back();
    cout<<"[";
    for(int i=0; i<que.size()-1; i++) {
        cout<<que[i]<<", ";
    }
    cout<<que[que.size()-1]<<"]"<<endl;

    que.pop_front();
    cout<<"[";
    for(int i=0; i<que.size()-1; i++) {
        cout<<que[i]<<", ";
    }
    cout<<que[que.size()-1]<<"]"<<endl;
}
void wrongSolution(vector<int> &que) {
    que.push_back(10);
    que.push_back(20);
    que.push_back(30);
    cout<<"[";
    for(int i=0; i<que.size()-1; i++) {
        cout<<que[i]<<", ";
    }
    cout<<que[que.size()-1]<<"]"<<endl; 

    //que.push_front(5);    error

    cout<<que[0]<<endl;

    //que.pop_front();      error

    que.pop_back();
    cout<<"[";
    for(int i=0; i<que.size()-1; i++) {
        cout<<que[i]<<", ";
    }
    cout<<que[que.size()-1]<<"]"<<endl;
}

int main() {
    deque<int> que;
    rightSolution(que); 

    return 0;
}