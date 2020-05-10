#include<iostream>
using namespace std;
int main()
{
  int m,n,a[10][10],l=0;
  cin>>m>>n;
  for(int i=0;i<m;i++)
 {
  for(int j=0;j<n;j++)
  {
    cin>>a[i][j];
  }
 } 
  
  for(int i=0;i<m;i++)
 {
  for(int j=0;j<n;j++)
  {
    if(a[i][j]>l)
      l=a[i][j];
    else 
      continue;
  }
    cout<<l<<endl;
    l=0;
 } 
  return 0;
}