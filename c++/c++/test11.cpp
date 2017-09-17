#include<iostream>
#include <algorithm>
//相邻数对
using namespace std;
int main(){
    int n;
    cin>>n;
    int num[n];
    for (int i=0; i<n; i++) {
        cin>>num[i];
    }
    int cot=0;
    for (int i=0; i<n-1; i++) {
        for (int j=i+1; j<n; j++) {
            if (abs(num[j]-num[i])==1) {
                    cot++;
            }
        }
    }
    cout<<cot;
    return 0;
}
