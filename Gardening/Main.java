#include<iostream>
using namespace std;
int main()
{
  int r,c,n,a;
  cin>>r>>c>>n;
  for(int i=r;i<=(c*2);i++)
  {
  if(n==i)
  {
    a=1;
  //cout<<i;
  }
  }
  for(int i=r*(c-2);i<=(r*(c-1));i++)
  {
  if(n==i)
    a=1;
  }
  
  if(a==1)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  return 0;
}