//
//  twoTentoEight.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/19.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//

#include <stdio.h>
int main(){
    int n,m,i=0;//原始数据 进制数 循环变量
    char result[10];
    int rs[10];
    scanf("%d%d",&n,&m);
    if (m>16||m<2) {
        return 0;
    }
    while (n) {
        rs[i]=n%m;
        if (rs[i]==10) {
            result[i]='A';
        }else if (rs[i]==11) {
            result[i]='B';
        } else if (rs[i]==12) {
            result[i]='C';
        }else if (rs[i]==13) {
            result[i]='D';
        }else if (rs[i]==14) {
            result[i]='E';
        }else if (rs[i]==15) {
            result[i]='F';
        }else{
            result[i]=rs[i]+'0';
        }
        n=n/m;
        i++;
    }
    for (int j=i-1; j>=0; j--){
        printf("%c",result[j]);
    }
     printf("\n");
}
