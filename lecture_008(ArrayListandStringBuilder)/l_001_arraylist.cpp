#include<iostream>
#include<vector>
using namespace std;

void solution(vector<int> &list) {
    //Add
    list.push_back(10);
    list.push_back(20);
    list.push_back(30);
    //cout<<list<<"->"<<list.size()<<endl;

    cout<<"[";
    for(int i=0; i<list.size()-1; i++) {
        cout<<list[i]<<", ";
    }
    cout<<list[list.size()-1]<<"]"<<"->"<<list.size()<<endl;
    // for(int r: list) {
    //     cout<<r<<", ";
    // }

    //Get
    int val = list[1];
    cout<<val<<endl;

    //Insert
    //list.assign(2,40);

    //Insert
    list.insert(list.begin()+1, 89);
    cout<<"[";
    for(int i=0; i<list.size()-1; i++) {
        cout<<list[i]<<", ";
    }
    cout<<list[list.size()-1]<<"]"<<"->"<<list.size()<<endl;

    //Replace
    list.at(1)=33;
    cout<<"[";
    for(int i=0; i<list.size()-1; i++) {
        cout<<list[i]<<", ";
    }
    cout<<list[list.size()-1]<<"]"<<"->"<<list.size()<<endl;

    //Delete
    list.erase(list.begin()+1);
    cout<<"[";
    for(int i=0; i<list.size()-1; i++) {
        cout<<list[i]<<", ";
    }
    cout<<list[list.size()-1]<<"]"<<"->"<<list.size()<<endl;
}

int main() {
    vector<int> list;
    solution(list);

    return 0;
}