#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int max;
    cin >> max;
    int min = max;
    for (int i = 0; i < n - 1; i++) {
        int temp;
        cin >> temp;
        if (max < temp) max = temp;
        if (min > temp) min = temp;
    }
    cout << min << '\n' << max;
}