#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
    int n;
    cin>>n;
    int num[n];
    vector<int> cot(10005);
    vector<int> rscot(10005);
    for (int i=0; i<n; i++) {
        cin>>num[i];
        cot[num[i]-1]++;
    }
    sort(cot.begin(), cot.end());
    for (int i=0; i<n; i++) {
        rscot[num[i]-1]++;
        if (cot[10004]==rscot[num[i]-1]) {
            printf("%d",num[i]);
            break;
        }
    }
   
    return 0;
    
}
