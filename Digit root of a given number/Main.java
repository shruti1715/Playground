#include<iostream>
using namespace std;
int root(int n)
{
  int sum = 0;
  while(n){
  sum += n%10;
  n /= 10;
  }
  if(sum<=9) return sum;
  else return root (sum);
}
int main()
{
 int n;
  cin>>n;
  cout<<root(n);
  return 0;
}
  