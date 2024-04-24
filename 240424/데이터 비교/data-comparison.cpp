#include <iostream>
#include <unordered_set>

using namespace std;

unordered_set<int> set1;

int n, m, t;
unordered_set<int> set;

int main() {

    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> t;
        set.insert(t);
    }

    cin >> m;
    for (int i = 0; i < m ; i++) {
        cin >> t;
        if (set.find(t) != set.end()) {
            cout << 1 << ' ';
        } else {
            cout << 0 << ' ';
        }
    }

    return 0;
}