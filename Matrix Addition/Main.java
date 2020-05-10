#include<iostream>
using namespace std;
int** createArray(int r,int c);
int getElement(int** a,int r,int c);
int addMatrix(int**,int**,int**,int,int);

void get(int a[20][20],int r,int c)
{
 for(int i=0;i<r;i++)
 {
  for(int j=0;j<c;j++)
  {
    cin>>a[i][j];
  }
 } 
}
void print(int a[20][20],int r,int c)
{
 for(int i=0;i<r;i++)
 {
  for(int j=0;j<c;j++)
  {
    cout<<a[i][j]<<" ";
  }
   cout<<endl;
 } 
}
int main()
{
  int r,c,a[20][20],b[20][20],add[20][20];
  cin>>r>>c;
  get(a,r,c);
  get(b,r,c);
  
  for(int i=0;i<r;i++)
 {
  for(int j=0;j<c;j++)
  {
    add[i][j]=a[i][j]+b[i][j];
  }
 } 
  
  print(add,r,c);
  return 0;
}