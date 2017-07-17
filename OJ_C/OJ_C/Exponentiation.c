//
//  Exponentiation.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/17.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//

#include <stdio.h>
#include <string.h>
int len;
int product[126]={0};
void multiply(int a[],int n){
    int i;
    int carry=0;
    for (i=0; i<len; i++) {
        int temp=a[i]*n+carry;
        a[i]=temp%10;//逆序输出结果后几位
        //printf("%d ",a[i]);
        carry=temp/10;//获取结果的前几位
        //printf("%d ",carry);
    }
    while (carry) {
        a[i++]=carry%10;
        printf("%d  ",a[i+1]);
        carry/=10;
    }
    len=i;
}
int main(){
    char s[6];//输入的字符串 以空格结束
    int n=0;//幂
    while (scanf("%s %d",s,&n)!=EOF) {//可以一直测试
        int position=0,i=0,j=0,num=0;//小数点后的位数，i，j
        for (i=0; i<strlen(s); i++) {
            if (s[i]=='.') {
                position=(int)(strlen(s)-i-1)*n;//len是unsigned long; 结果的小数位数
            } else {
                num=num*10+s[i]-48;//字符串(浮点数)转换成整数
            }
        }
        
        product[0]=1;
        len=1;
        for (i=0; i<n; i++) {
            multiply(product,num);//求乘积
        }
        
        //忽略小数点前面的0
        //len 结果的总位数
        if (len<=position) {
            printf(".");
            for (i=0; i<position-len; i++) {
                printf("0");//小数点和数字之间的0需要输出
            }
            j=0;
            for (i=len-1; i>=j; i--) {//小数点+0之后的数字
                printf("%d",product[i]);
            }
        }
        //忽略结尾的0
        else{
            //逆序存放
            j=0;
            while (product[j]==0&&j<position) {//因为是逆序存放  所以结果中数之后的0全部忽略
                j++;
            }
            for (i=len-1; i>=j; i--) {
                if(i+1==position){//遇到小数点
                    printf(".");
                }
                printf("%d",product[i]);
            }
        }
        printf("\n");
    }
    return 0;
}
