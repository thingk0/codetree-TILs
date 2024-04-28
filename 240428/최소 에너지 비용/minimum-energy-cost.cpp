#include <iostream>

using namespace std;

int n;
int *dist, *cost, *min_cost;

long long res = 0;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n;
    dist = new int[n + 1] ();
    cost = new int[n + 1] ();
    min_cost = new int[n + 1] ();

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

    for (int i = 1; i <= n; ++i) {
        res += (long long)min_cost[i] * dist[i];
    }

    cout << res;
    delete[] dist;
    delete[] cost;
    delete[] min_cost;
    return 0;
}