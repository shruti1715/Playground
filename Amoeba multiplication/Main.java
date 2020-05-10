#include<iostream>
using namespace std;
int main()
{
  int n,s=0,i,t1=0,t2=1,nt=0;
  cin>>n;
  for(i=1;i<=n;i++)
  {
   if(i==1)
   {
    s=t1;
     continue;
   }
    if(i==2)
    {
      s=t2;
      continue;
    }
    s=t1+t2;
    t1=t2;
    t2=s;
  }
  cout<<s;
  return 0;
}