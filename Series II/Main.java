#include<iostream>
using namespace std;
int main()
{
 int n,a=121,b=225,c=0;
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
   c=b+((b-a)+32);
   a=b;
   b=c;
   cout<<c<<" ";
 }
  return 0;
}