#include <iostream>
#include <unordered_map>

using namespace std;

unordered_map<int, int> um;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, m, t;
    cin >> n >> m;

    for (int i = 0; i < n; i++) {
        cin >> t;
        um[t]++;
    }

    while(m--) {
        cin >> t;
        cout << um[t] << ' ';
    }

    return 0;
}