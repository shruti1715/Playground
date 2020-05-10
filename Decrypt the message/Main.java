#include<iostream>
using namespace std;
int main()
{
 int a,b,s=0;
  cin>>a>>b;
  int t=a+b;
  for(int i=1;i<t;i++)
  {
   if(t%i==0)
      s=s+i;
    else
      continue;
  }
   if(s==t)
     cout<<"They can read the message";
  else 
    cout<<"They can't read the message";
  return 0;
}