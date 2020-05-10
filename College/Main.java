#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct College 
{ 
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage; 
};
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct College*)p)->name, 
                  ((struct College*)q)->name); 
} 
int main()
{
  int n;
  struct College c[n];
  cout<<"Enter the number of colleges";
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>c[i].name;
    cout<<"\nEnter city";
    cin>>c[i].city;
    cout<<"\nEnter year of establishment";
    cin>>c[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>c[i].passPercentage;
  }
  
  qsort(c, n, sizeof(struct College), comparator);
  cout<<"\nDetails of colleges";
  
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<c[i].name;
    cout<<"\nCity:"<<c[i].city;
    cout<<"\nYear of establishment:"<<c[i].establishmentYear;
    cout<<"\nPass percentage:"<<c[i].passPercentage;
  }
  return 0;
}