#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int x,y,s,i,m;
  x=n;
  m=x;
  while(x!=0)
  {
    x=x/10;
    i++;
  }
  //cout<<i;
  
  while(m!=0)
  {
    y=m%10;
    s=s+power(y,i);
    m=m/10;
  }
  if(s==n)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}