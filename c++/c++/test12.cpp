//相反数
#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int n;
    cin>>n;
    int num[n];
    cin>>num[0];
    for (int i=1; i<n; i++) {
        cin>>num[i];
        for (int j=0; j<i; j++) {
            if (num[j]==num[i]) {
                break;
            }
        }
    }
    int cot=0;
    for (int i=0; i<n-1; i++) {
        for (int j=i+1; j<n; j++) {
            if ((num[i]+num[j])==0) {
                cot++;
            }
        }
    }
    cout<<cot;
    return 0;
}
