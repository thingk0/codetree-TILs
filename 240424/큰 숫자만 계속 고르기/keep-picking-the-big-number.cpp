#include <iostream>
#include <queue>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    int t;
    priority_queue<int> pq;
    for (int i = 0; i < n; i++) {
        cin >> t;
        pq.push(t);
    }

    for (int i = 0; i < m; i++) {
        t = pq.top();
        pq.pop();
        pq.push(t - 1);
    }

    cout << pq.top();
    return 0;
}