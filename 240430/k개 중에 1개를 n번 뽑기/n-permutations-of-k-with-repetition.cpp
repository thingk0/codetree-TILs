#include <iostream>
#include <vector>

using namespace std;

int K, N;

void permute(int level, int* arr) {

    if (level == N) {
        for (int i = 0; i < N; i++) {
            cout << arr[i] << ' ';
        }
        cout << '\n';
        return;
    }

    for (int i = 1; i <= K; i++) {
        arr[level] = i;
        permute(level + 1, arr);
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> K >> N;
    int arr[N];

    permute(0, arr);
    return 0;
}