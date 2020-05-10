#include <iostream>
using namespace std;
int main()
{
   int n,c=1;
  cin>>n;
   for(int i=1;i<=n;i++)
   {
       if(i%2==0)
       cout<<++c;
       for(int j=1;j<n;j++)
       {
           cout<<i;
       }
       if(i%2!=0)
       cout<<++c;
       cout<<"\n";
   }
  return 0;
}