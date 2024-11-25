#include <iostream>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    int *cards = new int[N];
    for (int i = 0; i < N; i++)
        cin >> cards[i];
    
    int answer = 0;
    for (int i = 0; i < N - 2; i++) {
        if (cards[i] >= M) continue;
        for (int j = i + 1; j < N - 1; j++) {
            if (cards[i] + cards[j] >= M) continue;
            for (int k = j + 1; k < N; k++) {
                int sum = cards[i] + cards[j] + cards[k];
                if (sum > M) continue;
                if (sum > answer) answer = sum;
            }
        }
    }
    cout << answer;
}