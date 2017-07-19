//
//  twoEighttoTen.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/19.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//

#include <stdio.h>
#include <string.h>
int main(){
    int b,ret=0;//b:进制数
    char num[100];//输入的原始数据
    int number[100];//若16进制  则转换
    scanf("%d %s",&b,num);
    unsigned long int length=strlen(num);
    if (b>9) {
        for (int i=0; i<length; i++) {
            if (num[i]=='A') {
                number[i]=10;
            }else if (num[i]=='B') {
                number[i]=11;
            }else if (num[i]=='C') {
                number[i]=12;
            }else if (num[i]=='D') {
                number[i]=13;
            }else if (num[i]=='E') {
                number[i]=14;
            }else if (num[i]=='F') {
                number[i]=15;
            }else
                number[i]=num[i]-'0';//char中数字字符转换为int中的数字字符
        }
    }else if(b>1&&b<=9){
        for (int i=0; i<length; i++) {
            number[i]=num[i]-'0';//char中数字字符转换为int中的数字字符
        }
    }
    for (int i=0; i<length; i++) {
        if (number[i]>=b)//每一位必须小于进制数
            return -1;
        ret *= b;
        ret += number[i];
    }
    printf("%d\n",ret);
}
