#include <iostream>
using namespace std;

int main() {
    int num;
    int students[30] = {};
    for (int i = 0; i < 28; i++) {
        cin >> num;
        students[num - 1] = 1;
    }
    for (int i = 0; i < 30; i++) {
        if (students[i] == 0) cout << i + 1 << "\n";
    }
}