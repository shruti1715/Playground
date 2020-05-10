#include<iostream>
using namespace std;
int main()
{
  int n,i=1,t=0;
  cin>>n;
  while(i<=n)
  {
    t=t+i;
    i++;
  }
  cout<<t-n;
  return 0;
}