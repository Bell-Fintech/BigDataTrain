#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
#include <iterator>
using namespace std;
int main() {
    vector<int> Q;
    int n,op;
     scanf("%d%d",&n,&op);
    for(int i=0;i<n;i++){
        Q.push_back(i+1);
    }
    for (int j=0; j<op; j++) {
        int p,q;
        scanf("%d%d",&p,&q);
        vector<int>::iterator it=find(Q.begin(),Q.end(),p);
        it=Q.erase(it);
        it+=q;
        Q.insert(it, p);
    }
    for (int i=0; i<Q.size(); i++) {
        printf("%d ",Q[i]);
    }
    return 0;
}
