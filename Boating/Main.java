#include<iostream>
using namespace std;
int main()
{
  int x,y,z,a;
  cin>>x>>y>>z;
  a=(y*75)+(z*30);
  if(x>=a)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}