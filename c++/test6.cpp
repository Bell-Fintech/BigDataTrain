#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int n;
    scanf("%d",&n);
    int num[n];
    int cot=0,i=0;
    for (int i=0; i<n; i++) {
        scanf("%d",&num[i]);
    }
    while(i<n){
        for (int j=i+1; j<=n; j++) {
            if (num[j]!=num[i]) {
                cot++;
                i=j;
                continue;
            }
        }
    }
    printf("%d",cot);
    return 0;
    
}
