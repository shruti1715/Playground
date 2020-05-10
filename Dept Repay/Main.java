#include<iostream>
using namespace std;
int main()
{
  int p,r,n;
  float i,a,d,s;
  cin>>p>>r>>n;
  i=(p*r*n)/100;
  a=p+i;
  d=i*0.02;
  s=a-d;
  cout<<i<<endl<<a<<endl<<d<<endl<<s;
}