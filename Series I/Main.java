#include<iostream>
using namespace std;
int main()
{
 int n,j=1;
  float s=0.5;
  cin>>n;
  
  for(int i=1;i<=n;i++)
  {
    s=(float) s*j;
   cout<<s<<" ";
    j=3;
  }
  return 0;
}