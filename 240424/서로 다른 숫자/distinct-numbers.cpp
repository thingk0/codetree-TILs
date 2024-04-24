#include <iostream>
#include <unordered_set>

using namespace std;

int n, t;
unordered_set<int> set;

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> t;
        set.insert(t);
    }
    cout << set.size();
    return 0;
}