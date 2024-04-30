#include <iostream>
#include <algorithm>
#include <vector>
#include <tuple>

#define MAX_N 20
#define BOMB_TYPE_NUM 3

using namespace std;

int n;
int bomb_type[MAX_N][MAX_N];
bool bombed[MAX_N][MAX_N];
pair<int, int> bomb_shapes[BOMB_TYPE_NUM + 1][5] = {
    {},
    {{-2, 0}, {-1, 0}, {0, 0},  {1, 0}, {2, 0}},
    {{-1, 0}, {1, 0}, {0, 0}, {0, -1}, {0, 1}},
    {{-1, -1}, {-1, 1}, {0, 0}, {1, -1}, {1, 1}}
};

int res;
vector<pair<int, int>> bomb_pos;

bool in_range(int x, int y) {
    return 0 <= x && x < n && 0 <= y && y < n;
}

void bomb(int x, int y, int bomb_type) {
    for (int i = 0; i < 5; i++) {
        int dx, dy;
        tie(dx, dy) = bomb_shapes[bomb_type][i];

        int nx = x + dx, ny = y + dy;
        if (in_range(nx, ny)) {
            bombed[nx][ny] = true;
        }
    }
}

int calc() {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            bombed[i][j] = false;
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (bomb_type[i][j]) {
                bomb(i, j, bomb_type[i][j]);
            }
        }
    }

    int cnt = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (bombed[i][j]) {
                cnt++;
            }
        }
    }

    return cnt;
}

void find_max_area(int cnt) {
    if (cnt == (int)bomb_pos.size()) {
        res = max(res, calc());
        return;
    }

    for (int i = 1; i <= 3; i++) {
        int x, y;
        tie(x, y) = bomb_pos[cnt];

        bomb_type[x][y] = i;
        find_max_area(cnt + 1);
        bomb_type[x][y] = 0;
    }
}


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int bomb_place;
            cin >> bomb_place;
            if (bomb_place) {
                bomb_pos.push_back({i, j});
            }
        }
    }

    find_max_area(0);
    cout << res;

    return 0;
}