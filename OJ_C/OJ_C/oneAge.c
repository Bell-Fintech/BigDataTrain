//
//  oneAge.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/19.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//平均年龄  班上有学生若干名，给出每名学生的年龄(整数)，求班上所有学生的平均年龄，保留到小数点后两位

#include <stdio.h>
int main(){
    int num;
    scanf("%d",&num);
    int age,sum=0;
    for (int i=0; i<num; i++) {
        scanf("%d",&age);
        sum+=age;
    }
    printf("%.2f",(float)sum/num);
}
