#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  float score=0.0;
  do
  {
    cin>>n;
    if (n<0)
          score=score-1.0;
      else if(n%2!=0)
      {
            c++;
            score++;
       }
    else
           score=score-0.5;
  }while(n>0&&c!=3);
  
    cout<<score;
    return 0;
}