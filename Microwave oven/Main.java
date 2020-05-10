#include<iostream>
using namespace std;
int main()
{
  int n;
  float t;
  cin>>n>>t;
  if(n<=3)
  {
    if(n==1)
      cout<<t;
    else if(n==2)
      cout<<t+(t*0.5);
    else
      cout<<2*t;
  }
  else
    cout<<"Number of items is more";
  return 0;
}