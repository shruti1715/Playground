#include<iostream>
using namespace std;
int main()
{
  int m,n,a[10][10],s[10]={0},j=0;
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
    s[i]=s[i]+a[i][j];
  }
 } 
 // cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
    cout<<s[i]<<endl;
}