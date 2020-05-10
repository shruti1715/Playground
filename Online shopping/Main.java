#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,tf,ts,ta;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  tf=(float)(fa-(fa*fd)/100)+fs;
  ts=(float)(sa-(sa*sd)/100)+ss;
  ta=(float)(aa-(aa*ad)/100)+as;  
  cout<<"In Flipkart Rs."<<tf<<endl<<"In Snapdeal Rs."<<ts<<endl<<"In Amazon Rs."<<ta<<endl;
  if(tf<=ta&&tf<=ts)
    cout<<"He will prefer Flipkart";
  else if(ts<tf&&ts<ta)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
  return 0;
}