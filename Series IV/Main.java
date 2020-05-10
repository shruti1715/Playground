#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=2,c=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
   if(i==1)
   {
    cout<<a<<" ";
     continue;
   }
    if(i==2)
   {
    cout<<b<<" ";
     continue;
   }
    if(i%2!=0)
    {
      c=b+((b-a)+4);
      a=b;
      b=c;
      cout<<c<<" ";
      continue;
    }
    if(i%2==0)
    {
      c=b+(b-a);
      a=b;
      b=c;
      cout<<c<<" ";
      continue;
    }
  }
  return 0;
}