#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int tb,tr,r,b;
  float to,o,cr,n;
  cin>>tb>>tr>>r>>b;
  
  to=tb/6;
  o=(b/6)+(0.1*(b%6));
  cr=r/o;
  n=tr/to;
  cout<<to<<endl<<fixed<<setprecision(1)<<o<<endl<<cr<<endl<<n;
  if(cr>=n)
    cout<<endl<<"Eligible to Win";
  else
    cout<<endl<<"Not Eligible to Win";
  return 0;
}
