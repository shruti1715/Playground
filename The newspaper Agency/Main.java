#include<iostream>
using namespace std;
int main()
{
  int w=0, x=0, y=0, b,s,p;
  cin>>w>>x>>y;
  b=w*y;
  s=w*x;
  p=s-(b+100);
  cout<<p;
  return 0;
}