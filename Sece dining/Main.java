#include<iostream>
//#include<string>
using namespace std;
int main()
{
  string a;
  int r;
  cin>>a>>r;
  if(a=="front")
  {
      if(r==1)
        cout<<"Left Handed";
      else 
        cout<<"Right Handed";
  }
  else
  { 
      if(r==1)
      cout<<"Right Handed";
      else 
        cout<<"Left Handed";
  }
  
  return 0;
}