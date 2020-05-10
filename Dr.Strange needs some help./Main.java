#include<iostream>
using namespace std;
int bact(int m,int n)
{
 int x=1,i=1;
  while(i<=n)
  {
    x=x*m;
    i++;
  }
  return x;
}
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int x=bact(m,n);
  if(x>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}