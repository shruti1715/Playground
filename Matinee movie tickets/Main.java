#include<iostream>
using namespace std;
int main()
{
  int a;
  float t;
  cin>>a>>t;
  if((int)t==13)
  {
   if(a>13)
     cout<<"$5.00";
   else
    cout<<"$2.00";
  }
  else
  {
   if(a>13)
     cout<<"$8.00";
    else
     cout<<"$4.00";
  }
  return 0;
}