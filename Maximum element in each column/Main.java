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
  
  for(int i=0;i<n;i++)
 {
  for(int j=0;j<m;j++)
  {
    if(a[j][i]>l)
      l=a[j][i];
    else 
      continue;
  }
    cout<<l<<endl;
    l=0;
 } 
  return 0;
}