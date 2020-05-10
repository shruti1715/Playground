#include<iostream>
#include<string>
using namespace std;
string returnFloatingPart(string str) 
{ 
    int pos = str.find("."); 
    if (pos == string::npos) 
        return ""; 
    else
        return str.substr(pos + 1); 
} 
int main() 
{ 
	std::string fnum;
	getline(cin,fnum);
  cout<<"Floating part is : "<<returnFloatingPart(fnum);
}