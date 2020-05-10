#include<iostream>
using namespace std;
int type(int n,int *a)
{
  int e=0,o=0;
  for(int i=0;i<n;i++)
  {
   if(a[i]%2==0)
     e++;
    else
      o++;
  }
  if(e==n)
    return 1;
  else if(o==n)
    return 2;
  else
    return 3;
}
int main()
{
  int n,a[20],x;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>a[i];
  x=type(n,a);
  if(x==1)
    cout<<"\nThe array is Even";
  else if(x==2)
    cout<<"\nThe array is Odd";
  else
    cout<<"\nThe array is Mixed";
  return 0;
}