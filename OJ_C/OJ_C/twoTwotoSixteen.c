//
//  twoTwotoSixteen.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/19.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//

#include <stdio.h>
#include <string.h>
int main(){
    /*
    int ret=0,count=0;
    char num[16];//2进制
    gets(num);
    unsigned long int length=strlen(num);
    for (int i=0; i<length; i++) {
        if (num[i]=='0'||num[i]=='1') {
            if (length%4==0) {
                count=(int)length/4;
            }
            else{
                count=(int)length/4+1;
            }
        }

     }
     */
    int b=2,ret=0;//b:进制数
    char num[100];//输入的原始数据
    int number[100];//若16进制  则转换
    scanf("%s",num);
    unsigned long int length=strlen(num);
    for (int k=0; k<length; k++) {
        if (number[k]>=b)//每一位必须小于进制数
            return -1;
        number[k]=num[k]-'0';//char中数字字符转换为int中的数字字符
        ret *= b;
        ret += number[k];
    }
    printf("%d\n",ret);
    char result[10];
    int i=0,rs[10];
    while (ret) {
        rs[i]=ret%16;
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
            result[i]=rs[i]+'0';//int字符转char字符 +'0'
        }
        ret=ret/16;
        i++;
    }
    for (int j=i-1; j>=0; j--){
        printf("%c",result[j]);
    }
    printf("\n");
}
