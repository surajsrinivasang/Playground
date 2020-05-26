#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0; cin>>n; float sum;
  sum=sqrt(n); sum=(1/sum)*n;
  count=n+sum; cout<<++count;
}