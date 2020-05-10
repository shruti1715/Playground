#include<iostream>
using namespace std;
int main()
{
  int p,d;
  float m;
  cin>>m>>p>>d;
  if(d<=m*p)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}