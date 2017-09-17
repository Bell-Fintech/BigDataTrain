#include<iostream>
using namespace std;
int main(){
    int count=0;
    int n;
    cin>>n;
    int num[n];
    for (int i=0; i<n; i++) {
        cin>>num[i];
    }
    for (int i=1; i<n-1; i++) {
        if (num[i]>num[i-1]) {
            if (num[i+1]<num[i]) {
                count++;
            }
        }
        else{
            if (num[i+1]>num[i]) {
                count++;
            }
        }
    }
    cout<<count;
    return 0;
    
}
