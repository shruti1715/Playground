#include<iostream>
using namespace std;
int main()
{
  int n,i,t;
  cin>>n;
  t=n;
  while(t!=0)
  {
    i=i+(t%10);
    t=t/10;
  }
 if(n%i==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}