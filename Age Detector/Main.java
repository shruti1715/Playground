#include<iostream>
using namespace std;
int main()
{
  int b,c;
  cin>>b>>c;
  if(c>b)
    cout<<c-b;
  else 
    cout<<100-(b-c);
  return 0;
}