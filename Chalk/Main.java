#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
  int n,d=0;
  cin>>n;
 /*float j= 1-(1/sqrt(n));
  for(int i=1;i<=n;i++)
  {
     j=j+1;
  }
  //cout<<fixed<<setprecision(2)<<j<<endl;
  d=j+(1/sqrt(n))*n;*/
  d=n+sqrt(n)+1;
  cout<<d;
  return 0;
}