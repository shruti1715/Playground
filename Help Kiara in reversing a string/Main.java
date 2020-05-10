#include <iostream>
#include<string.h>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;  
  gets(str);
/*for(i=0;i<=100;i++)
  cin>>str[i];*/
count=strlen(str);
//  cout<<count;
int j=0;
 for(i=count-1;i>=0;i--)
 {
   rev[j]=str[i];
   j++;
 }
 rev[j]='\0';

std::cout<<rev;
}