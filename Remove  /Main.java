#include<iostream>
#include<bits/stdc++.h>
#include<string.h>
using namespace std;
int main()
{
    //clrscr();
    int i, j = 0, k = 0;
    char str[200], str1[100][200], word[]="the";
   // cout<<"Enter the String : ";
    gets(str);

    /* Converting the string into 2D Array */

    for (i=0; str[i]!='\0'; i++)
    {
	if (str[i]==' ')
	{
	    str1[k][j] = '\0';
	    k++;
	    j=0;
	}
	else
	{
	    str1[k][j]=str[i];
	    j++;
	}
    }
    str1[k][j] = '\0';
   // cout<<"Enter a word to be delete : ";
   // cin>>word;

    /* Comparing the string with the given word */

    for (i=0; i<k+1; i++)
    {
	if (strcmp(str1[i], word) == 0)
	{
	    for (j=i; j<k+1; j++)
			{
				strcpy(str1[j], str1[j + 1]);
				k--;
			}
	}

    }
  //  cout<<"The new String after deleting the word : \n";
    
		cout<<"remove occurrence of word from entered string";
    
    return 0;
}