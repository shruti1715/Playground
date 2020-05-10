#include<iostream>
using namespace std;
int main(){
  int b,g,x[10],n;
  g=0;
  b=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    
  cin>>x[i];
    if(x[i]%2==0)
      g=g+1;
    else
      b=b+1;
  }
cout<<b<<endl<<g;
  return 0;
}