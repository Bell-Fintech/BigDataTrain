#include <iostream>
#include <algorithm>
using namespace  std;
int main(){
    int n,k=0;
    scanf("%d",&n);
    int p[n];
    for (int i=0; i<n; i++) {
        scanf("%d",&p[i]);
    }
    int rs[n-1];
    for (int i=1; i<n; i++) {
        for (int j=i-1; j<i; j++) {
            rs[k]=abs(p[i]-p[j]);
            k++;
        }
    }
    sort(rs, rs+n-1);
    printf("%d",rs[n-2]);
    return 0;

}
