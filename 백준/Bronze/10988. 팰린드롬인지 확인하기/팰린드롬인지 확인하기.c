#include <stdio.h>

int main() {
    char str[101];
    int len = 0;
    
    scanf("%s", str);
    while (str[len]) {
        len++;
    }
    len--;
    for (int i = 0; i < len; i++) {
        if (str[i] != str[len - i]) {
            printf("0");
            return 0;
        }
    }
    printf("1");
    return 0;
}