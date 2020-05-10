#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s1[50],s2[50];
  int l1=0,l2=0,j=0,c=0,i;
  gets(s1);
  gets(s2);
  l1=strlen(s1);
  l2=strlen(s2);
  //cout<<l1<<" "<<l2;
  if(l1==l2)
  {
   for(i=l1-1;i>=0;i--)
   {
    if(s1[i]==s2[j])
      c++;
     j++;
   }
  }
  if(c==l1)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}