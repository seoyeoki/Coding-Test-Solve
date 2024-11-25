#include <iostream>
using namespace std;

int main() {
    int max;
    int save = 1;
    cin >> max;
    for (int i = 0; i < 8; i++) {
        int comp;
        cin >> comp;
        if (comp > max) {
            max = comp;
            save = i + 2;
        }
    }
    cout << max << '\n' << save;
}