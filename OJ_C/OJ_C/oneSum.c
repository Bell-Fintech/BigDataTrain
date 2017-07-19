//
//  oneSum.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/19.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//数字求和 给定一个正整数 a，以及另外的 5 个正整数，问题是:这 5 个整数中，小于 a 的整数的 和是多少?

#include <stdio.h>
int main(){
    int a,sum=0;
    int array[5],length=sizeof(array)/sizeof(array[0]);
    scanf("%d",&a);
    //printf("%lu",sizeof(array)/sizeof(int));
    for (int i=0; i<length; i++) {
        scanf("%d",&array[i]);
    }
    for (int i=0; i<length; i++) {
        if (array[i]<a) {
            sum+=array[i];
        }
    }
    printf("%d\n",sum);
}
