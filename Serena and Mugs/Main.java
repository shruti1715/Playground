#include<iostream>
using namespace std;
int printresult(int*,int,int);
int main()
{
  int n,s,a[n],x=0;
  cin>>n>>s;
  for(int i=0;i<n;i++)
  {
   cin>>a[i]; 
  }
  for(int i=0;i<n;i++)
  {
   x=x+a[i]; 
  }
  if(x<=s)
    cout<<"YES";
  else
    cout<<"NO";
  return 0;
  
  
}