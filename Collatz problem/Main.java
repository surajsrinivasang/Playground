#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0; cin>>n;
  for(int i=n;i>=1;i++) {
  if(n==1) {cout<<"1\n"; break;}
  else{
    cout<<n<<endl;
  if(n%2==0) {n/=2; count++;}
  else if(n%2==1) {n=(3*n)+1; count++;}}
}
cout<<count<<endl;}