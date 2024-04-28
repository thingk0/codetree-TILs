#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;
    
    int dist[n + 1] {};
    int cost[n + 1] {};
    int min_cost[n + 1] {};

    for (int i = 2; i <= n; ++i) {
        cin >> dist[i];
    }

    for (int i = 1; i <= n; ++i) {
        cin >> cost[i];
    }

    min_cost[2] = cost[1];
    for (int i = 3; i <= n; ++i) {
        min_cost[i] = min(min_cost[i - 1], cost[i - 1]);
    }

    long long res = 0;
    for (int i = 1; i <= n; ++i) {
        res += (long long)min_cost[i] * dist[i];
    }

    cout << res;
    return 0;
}