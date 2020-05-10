#include<iostream>
using namespace std;
int main()
{
 int n,a=6,c,j=5;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
   if(i==1)
   {
     cout<<a<<" ";
     continue;
  }
   c=a+j;
    a=c;
    j=j+5;
    cout<<c<<" ";
  }
  return 0;
} 