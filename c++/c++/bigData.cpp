#include <iostream>
#include <string>
using namespace std;
#define maxlength 1000
char a1[maxlength];
char a2[maxlength];
int v1[maxlength];
int v2[maxlength];
int v3[maxlength];
long l=0;
int main(){
    int n;
    cin>>n;
    for (int i=0; i<n; i++) {
        cin>>a1>>a2;
    }
    l=strlen(a1);
    for (int i=0; i<l; i++) {
        v1[l-1-i]=a1[l-1-i]-'0';
    }
    l=strlen(a2);
    for (int i=0; i<l; i++) {
        v2[l-1-i]=a2[l-1-i]-'0';
    }
    for (int i=0; i<maxlength; i++) {
        v3[i]=v1[i]+v2[i];
    }
    for (int i=0; i<maxlength; i++) {
        if (v3[i]>=10) {
            v3[i+1]+=v3[i]/10;
            v3[i]=v3[i]%10;
        }
    }
    int z=0;
    for (int i=maxlength-1; i>=0; i--) {
        if (z==0) {
            if (v3[i]!=0) {
                cout<<v3[i];
                z=1;
            }
        }  else {
             cout<<v3[i];
        }
    }
    if (z==0) {
        cout<<"0";
    }
    return 0;
}
