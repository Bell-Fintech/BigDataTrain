//
//  oneSecret.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/19.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//简单密码Julius Caesar 曾经使用过一种很简单的密码。对于明文中的每个字符，将它用它字母表 中后 5 位对应的字符来代替，这样就得到了密文。比如字符 A 用 F 来代替。如下是密文和 明文中字符的对应关系。
/*
密文
ABCDEFGHIJKLMNOPQRSTUVWXYZ
明文
VWXYZABCDEFGHIJKLMNOPQRSTU
你的任务是对给定的密文进行解密得到明文。
你需要注意的是，密文中出现的字母都是大写字母。密文中也包括非字母的字符，对这 些字符不用进行解码。
*/
#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main(){
    char letter[26];
    //注意长度 写strlen(letter)报错 strlen【lu：unsigned long int】只有在赋值后才可以使用
    for (int i=0; i<sizeof(letter)/sizeof(letter[0]); i++) {
        letter[i]='A'+i;
    }
    char secret[100];
    //scanf("%s",secret);// 空格结束
    gets(secret);// \n结束
    for (int i=0; i<strlen(secret); i++) {
       // if (islower(secret[i])) {//输入时限制就可以
        
        if (secret[i]>='A'&&secret[i]<='E') {
                    char c=secret[i];
                    for (int j=0; j<strlen(letter); j++) {
                        if(letter[j]==c){
                            secret[i]=letter[j+26-5];
                            break;
                        }
                    }
                }
      else  if (secret[i]>='F'&&secret[i]<='Z') {
                char c=secret[i];
                for (int j=0; j<strlen(letter); j++) {
                    if(letter[j]==c){
                        secret[i]=letter[j-5];
                        break;
                    }
                }
        }
      else  if (islower(secret[i])) {
          break;
      }
    }
    puts(secret);
}
