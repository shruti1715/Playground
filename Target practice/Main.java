#include<iostream>
using namespace std;
int main()
{
  int n,a,i=0,s=0;
  cin>>n;
  for(i=0;s<n;i++)
  {
    cin>>a;
    s=s+a;
  }
  cout<<"The number of turns is "<<i;
  return 0;
}