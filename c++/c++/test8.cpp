//图像旋转
#include <iostream>
using namespace std;
int main(){
    int n,m;
    cin>>n>>m;
    int num[n][m];
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            scanf("%d",&num[i][j]);
        }
    }
     for (int j=m-1; j>=0; j--) {
         for (int i=0; i<n; i++) {
             printf("%d ",num[i][j]);
        }
         printf("\n");
    }
}
