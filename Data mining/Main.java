#include<iostream>
using namespace std;
int main()
{
  int n,i=0,e=0,o=0;
  cin>>n;
 
  while(n!=0)
  {
    i=n%10;
    if(i%2==0)
      e=e+i;
    else
      o=o+i;
    n=n/10;
  }
  
  if(e==o)
  cout<<"Yes";
    else
      cout<<"No";
  return 0;
}