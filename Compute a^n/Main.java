#include<iostream>
using namespace std;
int pow(int a,int n)
{
  if(n==0)
    return 1;
  return (a*pow(a,n-1));
}
int main()
{
  int a,n;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>n;
  cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<pow(a,n);
  return 0;
}