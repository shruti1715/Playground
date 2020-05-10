#include<iostream>
using namespace std;
struct complex
{
  double real;
  double imag;
};
complex add(complex a, complex b)
{
  complex c;
  c.real=a.real+b.real;
  c.imag=a.imag+b.imag;
  return c;
}
complex sub(complex a, complex b)
{
  complex c;
  c.real=a.real-b.real;
  c.imag=a.imag-b.imag;
  return c;
}
complex multi(complex a, complex b)
{
  complex c;
   c.real=(a.real * b.real) - (a.imag * b.imag);
   c.imag=(a.real * b.imag) + (a.imag * b.real);
  return c;
}
int main()
{
 complex a,b,c;
  int n;
  cin>>n;
  cin>>a.real>>a.imag>>b.real>>b.imag;
  switch(n)
  {
    case 1: c=add(a,b);
      cout<<c.real<<"+"<<c.imag<<"i";
      break;
    case 2: c=sub(a,b);
      cout<<c.real<<"+"<<c.imag<<"i";
      break;
    case 3: c=multi(a,b);
      cout<<c.real<<""<<c.imag<<"i";
      break;
    default: cout<<"Invalid choice"; 
      break;
  }
  return 0;
}