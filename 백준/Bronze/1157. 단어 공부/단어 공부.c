#include <stdio.h>

int main() {
    int alp[26] = {0};
    int mindex = 0;
    int len = 0;
    int flag = 0;
    char str[1000001];

    scanf("%s", str);
    while (str[len]) {
        if ('A' <= str[len] && str[len] <= 'Z')
            alp[str[len] - 'A']++;
        if ('a' <= str[len] && str[len] <= 'z')
            alp[str[len] - 'a']++;
        len++;
    }
    for (int i = 1; i < 26; i++) {
        if (alp[mindex] == alp[i] && alp[i] != 0) {
            flag = 1;
        }
        if (alp[mindex] < alp[i]) {
            mindex = i;
            flag = 0;
        }
    }
    if (flag == 1) printf("?");
    else printf("%c", 'A' + mindex);
}