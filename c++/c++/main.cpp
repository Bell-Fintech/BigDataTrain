//
//  main.cpp

#include <iostream>
using namespace std;
int n,k,rs=0,sum=0;
int weight[1005];
int main(int argc, const char * argv[]) {
    
    scanf("%d%d",&n,&k);
    for(int i=0;i<n;i++){
        scanf("%d",&weight[i]);
        sum+=weight[i];
        if (sum>=k) {
            sum=0;
            rs++;
        }
    }
    if (sum>0) {
        rs++;
    }
    printf("%d",rs);
    return 0;
}
