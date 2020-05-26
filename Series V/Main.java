#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=121; cin>>n;
  for(int i=-1;i<n-1;i++)
  { if(i==-1 || n==1) {cout<<"121 "; if (n==1) {break;}}
   else {a+=104+(32*i); cout<<a<<" ";}
}}