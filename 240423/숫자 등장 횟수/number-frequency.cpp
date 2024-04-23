#include <iostream>
#include <unordered_map>

using namespace std;

int n, m, t;
unordered_map<int, int> map;

int main() {
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> t;
        if (map.find(t) != map.end()) {
            map[t]++;
        } else {
            map[t] = 1;
        }
    }

    for (int i = 0; i < m; i++) {
        cin >> t;
        cout << map[t] << ' ';
    }

    return 0;
}