#include <iostream>
#include <unordered_map>

using namespace std;

int n, k, t, res = 0;
unordered_map<long long, int> cnt;

int main() {

    cin >> n >> k;

    for (int i = 0; i < n; i++) {
        cin >> t;
        res += cnt[(long long)k - t];
        cnt[t]++;
    }
    cout << res;
    return 0;
}