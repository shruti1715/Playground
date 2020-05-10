#include<iostream>
using namespace std;
int main()
{
  int r,c,n,a;
  cin>>r>>c>>n;
  for(int i=1;i<=c;i++)
  {
    if(n==i)
      a=1;
  }
  for(int j=1;j<=r;j++)
  {
    if(n==j*c)
      a=1;
  }
  for(int k=1;k<=r;k++)
  {
    int p=k*c+1;
   if(n==p)
      a=1;
  }
  //cout<<a;
  if(a==1)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}