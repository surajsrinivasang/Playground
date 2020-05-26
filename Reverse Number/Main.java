#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int a[100]; int i=0;
  int n;cin>>n;
  while(n>0)
  {
   a[i]=n%10; i++ ; n/=10;}
  for(int k=0;k<i;k++)
  {cout<<a[k];}
	return 0;
}