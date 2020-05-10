#include <iostream>
#include<string.h>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student s;
  gets(s.name);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"\nStudent Details"<<endl<<"Name: "<<s.name<<endl;
  cout<<"Roll: "<<s.roll<<endl<<"Marks: "<<s.marks;
  return 0;
}