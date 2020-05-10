#include<iostream>
using namespace std;
void print(int x)
{
 if(x==1)
   cout<<"Arun Gupta";
  else
    cout<<"Mani Iyer";
}
int main()
{
  int n,m,a[n][m],c;
  cin>>n>>m;
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<m;j++)
   {
    cin>>a[i][j]; 
   }
  }
  if(n%2==0 && m%2==0)
  {
   c=2;
    print(c);
  }
  else 
  {
   c=1;
    print(c);
  }
  
  return 0;
}