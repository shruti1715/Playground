#include<iostream>
using namespace std;
int main()
{
  int x,r;
  cin>>r>>x;
  if(r<=x/2)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  return 0;
}