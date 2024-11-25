#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    getline(cin, str);
    int n;
    cin >> n;
    cout << str[n - 1];
}