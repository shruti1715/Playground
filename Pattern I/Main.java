#include<iostream>
using namespace std;
int main()
{
int a,b=0;
  cin>>a;
  for(int i=a;i<=(a+3);i++)
  {
    for(int j=i;j<=(i+b);j++)
    {
    cout<<i;
    }
    cout<<endl;
    b++;
  }
  for(int i=(a+3);i>=a;i--)
  {
   for(int j=i;j<=(i+(b-1));j++)
   {
   cout<<i;
   }
    cout<<endl;
    b--;
  }
  
  return 0;
}