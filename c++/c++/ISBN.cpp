#include <iostream>
#include <algorithm>
#include <string>
#include <stdlib.h>
using namespace std;
int main(){
    char s[13];
    cin>>s;
    int sum=0;
    int j=1;
    for (int i=0; i<11; i++) {
        if (s[i]!='-') {
            sum+=(s[i]-48)*j;
            j++;
        }
    }
    int end=sum%11;
    if (end==10&& s[12]=='X')
        cout<<"Right";
    else  if (end==10&& s[12]!='X') {
        s[12]='X';
        cout<<s;
    }else if(end<10&&(s[12]-48)==end)
        cout<<"Right";
    else{
        //int---char
        s[12]=end+48;
        cout<<s;
    }
    
    return 0;
    
}
