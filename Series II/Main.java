#include<iostream>
using namespace std;
int main() {
  int n,a,b=1; cin>>n; a=121;
  for(int i=1;i<=n;i++)
  {
    if(i==1) {cout<<"121 ";}
    else if(i==2) {a+=104;cout<<a<<" ";}
    else if(i>2) {a=a+104+(32*b++); cout<<a<<" ";}}}