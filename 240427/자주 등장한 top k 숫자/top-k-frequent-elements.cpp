#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>

using namespace std;

unordered_map<int, int> freq;
vector<pair<int, int>> v;

int n, k, t;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n >> k;
    for (int i = 0; i < n; i++) {
        cin >> t;
        freq[t]++;
    }

    for (unordered_map<int, int>::iterator it = freq.begin(); it != freq.end(); it++) {
        v.push_back(make_pair(it->second, it->first));
    }

    sort(v.begin(), v.end());

    for (int i = (int)v.size() - 1; i >= (int)v.size() - k; i--) {
        cout << v[i].second << ' ';
    }

    return 0;
}