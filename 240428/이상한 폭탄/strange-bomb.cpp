#include <iostream>
#include <unordered_map>

#define MAX_N 200000

using namespace std;

int n, k, res = -1;
int arr[MAX_N];
int R[MAX_N];
unordered_map<int, int> ldx;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n >> k;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    for (int i = n - 1; i >= 0; --i) {
        if (ldx.find(arr[i]) == ldx.end()) {
            R[i] = -1;
        } else {
            R[i] = ldx[arr[i]];
        }
        ldx[arr[i]] = i;
    }

    for (int i = 0; i < n; ++i) {
        if (R[i] != -1 && R[i] - i <= k) {
            res = max(res, arr[i]);
        }
    }

    cout << res;
    return 0;
}