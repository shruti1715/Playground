#include<iostream>
using namespace std;

int gcd(int a,int b)
{
  while(a!=b)
    {
        if(a>b)
            a -= b;
        else
            b -= a;
    }
  return a;
}

int main()
{
 int a,b,c,d,g; 
  cin>>a>>b>>c>>d;
  g=gcd(gcd(a,b),c);
  if(g==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  return 0;
}