#include <iostream>
using namespace std;
int main(){
    int n;
    scanf("%d",&n);
    int num[n];
    /*
    int site[20][5];
    for (int i=0; i<20; i++) {
        for (int j=0; j<5; j++) {
            if (i==0) {
                site[i][j]=(i+1)*(j+1);
            }
            else
                site[i][j]= site[i-1][j]+5;
        }
    }*/
    int s[100];
    int site[100]={0};
    for (int i=0; i<100; i++) {
        s[i]=i+1;
    }
    for (int i=0; i<n; i++) {
        scanf("%d",&num[i]);
        if (num[i]==5) {
            
        }
        else{
        for (int j=0; j<num[i]; j++) {
            if (site[j]==0) {
                 site[j]=1;
                printf("%d ",s[j]);
            }
        }
        printf("\n");
        }
    }
    
    return 0;
    
}
