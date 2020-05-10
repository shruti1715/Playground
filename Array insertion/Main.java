#include<iostream>
using namespace std;
int main()
{
  int a[20],n,p,v;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>p;
 if(p<=5)
  {
  cout<<"\nEnter the value to insert";
  cin>>v;
 
  n++;
   for (int i = n; i >= p; i--) 
        a[i] = a[i - 1]; 
  
    // insert x at pos 
    a[p - 1] = v;
  cout<<"\nArray after insertion is\n";
  for(int i=0;i<n;i++)
  {
   cout<<a[i]<<endl; 
  }
  }
  else
    cout<<"\nInvalid Input";
  return 0;
}