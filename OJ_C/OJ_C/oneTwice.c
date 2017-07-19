//
//  oneTwice.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/19.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//两倍  给定 2 到 15 个不同的正整数，你的任务是计算这些数里面有多少个数对满足:数对中 一个数是另一个数的两倍。比如给定 1 4 3 2 9 7 18 22，得到的答案是 3，因为 2 是 1 的两倍， 4是2个两倍，18是9的两倍。

#include <stdio.h>
int main(){
    int num[]={1,4,3,2,9,7,18,22,2};
    int count=0;
    int length=sizeof(num)/sizeof(num[0]);
    if (length>1&&length<16) {
        for (int i=0; i<sizeof(num)/sizeof(num[0]); i++) {
            for (int j=0; j<sizeof(num)/sizeof(num[0]); j++) {
                if (num[i]==num[j]*2) {
                    count++;
                }
            }
        }
    }
    else
        return 0;
    printf("%d\n",count);
}
