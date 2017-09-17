#include <iostream>
#include <algorithm>
using namespace std;
int n,m;
int raw[31][31],sign[31][31];

int main(){
    scanf("%d%d",&n,&m);
    for (int i=0; i<n; i++)
        for (int j=0; j<m; j++)
            scanf("%d",&raw[n][m]);
    int cot=1;
    for (int i=0; i<n; i++)
        for (int j=0; j<m; j++) {
            while(raw[i][j]==raw[i][j+1]) {
                j++;
                if (j==m) break;
                cot++;
                if (cot >=3 )
                    for (int k=j-cot+1; k<=j; k++)
                        sign[i][k]=1;
            }
         cot=1;
    }
    for (int j=0; j<m; j++)
        for (int i=0; i<n; i++) {
            while(raw[i][j]==raw[i+1][j]) {
                i++;
                if (i==n) break;
                cot++;
                if (cot >=3 )
                    for (int k=i-cot+1; k<=i; k++)
                        sign[j][k]=1;
            }
        cot=1;
    }
    for (int i=0; i<n; i++)
        for (int j=0; j<m; j++)
            if (sign[i][j])
                raw[i][j]=0;
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++)
            printf("%d ",raw[i][j]);
        printf("\n");
    }
    return 0;
}
