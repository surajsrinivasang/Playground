#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=2; cin>>n;
  for(int i=1;i<=n;i++)
  {if(a==2) {a=1;} else if(a==1) {a=2;}
    cout<<(i*i)-a<<" ";}
}