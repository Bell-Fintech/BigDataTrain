#include<iostream>
#include <string>
using namespace std;
int main(){
    string s1,s2;
    char num[1000];
    long len1,len2;
        cin>>s1>>s2;
        len1=s1.size();
        len2=s2.size();
        int len=0;
        int p=0;
        for (; len1>0||len2>0; len1--,len2--) {
            if (len1>0&&len2>0) {
                num[len]=(((s2[len2-1]-'0')+(s1[len1-1]-'0')+p)%10)+'0';
                p=((s2[len2-1]-'0')+(s1[len1-1]-'0')+p)/10;
            }
            else if (len1<=0)
            {
                num[len]=(((s2[len2-1]-'0')+p)%10)+'0';
                p=((s2[len2-1]-'0')+p)/10;
            }
            else{
                num[len]=(((s1[len1-1]-'0')+p)%10)+'0';
                p=((s1[len1-1]-'0')+p)/10;
            }
            len++;
        }
        if (p>0) {
            cout<<"1";
        }
        for (int k=len-1; k>=0; k--) {
            cout<<num[k];
        }
    
    return 0;
}
