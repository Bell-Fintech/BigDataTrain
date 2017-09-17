//门禁系统
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int> record(n);
    int num[1005]={0};
    for (int i=0; i<n; i++) {
        cin>>record[i];
    }
    for (int i=0; i<n; i++) {
        num[record[i]]++;
        cout<<num[record[i]]<<" ";
    }
    return 0;
}
