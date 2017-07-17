//
//  Exponentiation.c
//  OJ_C
//
//  Created by ZD-Mac on 2017/7/17.
//  Copyright © 2017年 ZD-Mac. All rights reserved.
//

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define dig 1000
int main(){
    char s[6];
    char *end;
    char *rs[6];
    int n=0;
    for (int i=0; i<2; i++) {
        scanf("%s%d",s,&n);
        double num=strtod(s,&end);//s--double
        double result=1;
        for (int j=0; j<n; j++) {
            result*=num;
        }
        gcvt(result, dig, rs[i]);//double--s
    }
    for (int i=0; i<2; i++) {
        printf("%s",rs[i]);
    }
    return 0;
}
