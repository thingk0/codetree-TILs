#include <iostream>
#include <queue>

#define MAX_N 100
#define MAX_M 100

using namespace std;

int n, m;
int grid[MAX_N][MAX_M];

queue<pair<int, int>> q;
bool visited[MAX_N][MAX_M];

bool in_range(int r, int c) {
    return 0 <= r && r < n && 0 <= c && c < m;
}

bool can_go(int r, int c) {
    return in_range(r, c) && grid[r][c] && !visited[r][c];
}

void bfs() {

    int dr[4] = {1, 0, -1, 0};
    int dc[4] = {0, 1, 0, -1};

    while (!q.empty()) {
        pair<int, int> pos = q.front();
        int r = pos.first, c = pos.second;
        q.pop();

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i], nc = c + dc[i];
            if (can_go(nr, nc)) {
                q.push(make_pair(nr, nc));
                visited[nr][nc] = true;
            }
        }
    }
}

int main() {
    cin >> n >> m;
    for (int r = 0; r < n; r++) {
        for (int c = 0; c < m; c++) {
            cin >> grid[r][c];
        }
    }

    q.push(make_pair(0, 0));
    visited[0][0] = true;

    bfs();
    cout << visited[n - 1][m - 1];

    return 0;
}