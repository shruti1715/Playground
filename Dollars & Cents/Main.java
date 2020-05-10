#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,t1=0,t2=0;
  cin>>d1>>c1>>d2>>c2;
  t1=(c1+c2)%100;
  t2=((c1+c2)/100)+(d1+d2);
 // t2=d1+d2;
  
  cout<<t2<<endl<<t1;
  return 0;
}