#include<iostream>
using namespace std;
int main()
{
  int y;
  cin>>y;
  if(y%4==0)
    cout<<y<<" is a leap year";
  else
    cout<<y<<" is not a leap year";
  return 0;
}