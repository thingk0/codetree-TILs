#include <iostream>
#include <queue>

#define MAX_N 100

using namespace std;

queue<pair<int, int>> q;
int grid[MAX_N][MAX_N];
bool vistied[MAX_N][MAX_N];

int n, k;
int dr[4] = {1, -1, 0, 0};
int dc[4] = {0, 0, 1, -1};

bool in_range(int r, int c) {
    return 0 <= r && r < n && 0 <= c && c < n;
}

void bfs() {
    while (!q.empty()) {
        pair<int, int> pos = q.front();
        int r = pos.first, c = pos.second;
        q.pop();

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i], nc = c + dc[i];
            if (!in_range(nr, nc) || grid[nr][nc] || vistied[nr][nc]) {
                continue;
            }

            q.push(make_pair(nr, nc));
            vistied[nr][nc] = true;
        }
    }
}

int main() {

    cin >> n >> k;
    for (int r = 0; r < n; r++) {
        for (int c = 0; c < n; c++) {
            cin >> grid[r][c];
        }
    }

    for (int i = 0; i < k; i++) {
        int row, col;
        cin >> row >> col;
        q.push(make_pair(row - 1, col - 1));
        vistied[row - 1][col - 1] = true;
    }

    bfs();
    int res = 0;
    for (int r = 0; r < n; r++) {
        for (int c = 0; c < n; c++) {
            if (vistied[r][c]) {
                res++;
            }
        }
    }

    cout << res;
    return 0;
}