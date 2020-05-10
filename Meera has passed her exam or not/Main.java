#include<iostream>
using namespace std;
int main()
{
  int n,r[100],a,c;
  cin>>n;
  for(int i=0;i<n;i++)
  {
   cin>>r[i]; 
  }
  cin>>a;
  for(int i=0;i<n;i++)
  {
   if(a==r[i])
     c=1;
  }
  if(c==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  return 0;
}