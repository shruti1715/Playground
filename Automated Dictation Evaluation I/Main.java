#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s1[50],s2[50];
  int i;
  gets(s1);
  gets(s2);
  i=strcmp(s1,s2);
  if(i==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}