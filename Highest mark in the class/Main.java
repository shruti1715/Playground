#include<iostream>
using namespace std;
int main()
{
  int n,m[100],a=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
   cin>>m[i]; 
  }
  
  for(int i=0;i<n;i++)
  {
   if(a<m[i])
     a=m[i];
  }
  cout<<a;
  return 0;
}