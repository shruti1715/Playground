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
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
    cout<<s[i]<<" ";
  for(int i=0;i<m;i++)
  {
   if(s[i]>=s[i+1])
   { j=i;
    break;}
  }
  cout<<"\nRow "<<j+1<<" has maximum sum";
  
  for(int i=0;i<n;i++)
    s[i]=0;
  
  for(int i=0;i<n;i++)
 {
  for(int j=0;j<m;j++)
  {
    s[i]=s[i]+a[j][i];
  }
 } 
  cout<<"\nSum of columns is ";
  for(int i=0;i<n;i++)
    cout<<s[i]<<" ";
  j=0;
  for(int i=0;i<n;i++)
  {
   if(s[i]>=s[i+1])
   { j=i;
    break;}
  }
  cout<<"\nColumn "<<j+1<<" has maximum sum";
  return 0;
}