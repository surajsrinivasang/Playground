#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int count=0,a,b,i,x=3,y=4; cin>>a>>b; a>=b? i=a : i=b; 
  for(int j=0;j<i;j++)
  {
    if(x!=a && y!=b) {x++; y++; count++;}
    else if(x==a && y!=b) {y++; count++;}
    else if(x!=a && y==b) {x++; count++;}
    else if(x==a && y==b) { break;}}
  cout<<count;
}