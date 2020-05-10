#include<iostream>
using namespace std;
int main()
{
  int a,n[15],e=0,o=0;
  cin>>a;
  for(int i=0;i<a;i++)
  {
   cin>>n[i]; 
  }
  
  for(int i=0;i<a;i++)
  {
   if(n[i]%2==0)
     e=e+n[i];
    else
      o=o+n[i];
  }
  cout<<"The sum of the even numbers in the array is "<<e<<endl;
  cout<<"The sum of the odd numbers in the array is "<<o;
}