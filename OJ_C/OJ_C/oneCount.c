//
//  oneCount.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/19.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//垂直直方图 输入 4 行全部由大写字母组成的文本，输出一个垂直直方图，给出每个字符出现的次数。 注意:只用输出字符的出现次数，不用输出空白字符，数字或者标点符号的输出次数。

#include <stdio.h>
int main(){
    int num[26];
    //char character[26];
    int i,j;
    for (i=0; i<26; i++) {
        num[i]=0;
    }
    for (i=0; i<4; i++) {
        char str[100];
        gets(str);
        for (j=0; str[j]!='\0'; j++) {
            num[str[j]-'A']++;//求出每个字母的总次数
        }
    }
    int max = 0;
    for (i=0;i<26;i++){
        if (num[i]>max)
            max = num[i];//求出出现最多的次数 作为行循环
    }
    for (i=max;i>0;i--)//以出现最多的次数为行数的循环
    {
        for (j=0;j<26;j++)//每行26个字母循环判断输出
        {
            if (num[j]>=i)//这个字母的次数开始输出
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }
    for (i=0; i<26; i++) {
        printf("%c ",i+'A');
    }
}
