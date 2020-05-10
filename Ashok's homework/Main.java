#include<iostream>
using namespace std;
int main()
{
    int a[30][30],b[30][30],n[30][30],r,c;
  cin>>r>>c;
  //matrix 1 ip
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cin>>a[i][j]; 
   }
  }
  //matrix 2 ip
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cin>>b[i][j]; 
   }
  }
  //addition
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
     n[i][j]=a[i][j]+b[i][j]; 
   }
  }
  //op
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cout<<n[i][j]<<" ";
   }
    cout<<endl;
  }
  return 0;
}