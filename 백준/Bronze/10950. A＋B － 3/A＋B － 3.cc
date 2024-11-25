#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int A, B;
    for (int i = 0; i < n; i++) {
        cin >> A >> B;
        cout << A + B << '\n';
    }
}