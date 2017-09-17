#include <iostream>
#include <algorithm>
using namespace std;
int n;
int length=0,lCount=0,rCount=0,eCount=0;
int main(){
    scanf("%d",&n);
    int num[n];
    for (int i=0; i<n; i++) {
        scanf("%d",&num[i]);
    }
    sort(num, num+n);
    length=(int)sizeof(num)/sizeof(num[0]);
    int middle=num[length/2+1];
    int middle1=num[length/2];
    if(n%2!=0){
        for ( int i=1; i<=n; i++) {
            if (num[i]<middle) {
                lCount++;
            }else if (num[i]>middle) {
                rCount++;
            }
            else{
                eCount++;
            }
        }
        if (lCount==rCount&&eCount%2!=0) {
            printf("%d",middle);
        }else{
            printf("-1");
        }
    }else{
        lCount=0;rCount=0;eCount=0;
        for ( int i=0; i<n; i++) {
            if (num[i]<middle1) {
                lCount++;
            }else if (num[i]>middle1) {
                rCount++;
            }
            else{
                eCount++;
            }
        }
        if (lCount==rCount&&eCount%2==0) {
            printf("%d",middle1);
        }else{
            printf("-1");
        }

    }
   
    return 0;
}
