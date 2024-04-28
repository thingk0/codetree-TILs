#include <iostream>
#include <unordered_map>

using namespace std;

int n, k, t, res = -1;
unordered_map<int, int> ldx;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n >> k;
    for (int i = 0; i < n; i++) {
        cin >> t;
        if (ldx.find(t) != ldx.end() && i - ldx[t] <= k && res < t) {
            res = t;
        }
        ldx[t] = i;
    }

    cout << res;
    return 0;
}