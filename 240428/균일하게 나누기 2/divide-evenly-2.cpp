#include <iostream>
#include <algorithm>

#define MAX_N 1000
#define MAX_R 1000
#define MAX_Q 4

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    pair<int, int> points[n];
    for (int i = 0; i < n; i++) {
        int x, y;
        cin >> x >> y;
        points[i] = make_pair(x, y);
    }

    sort(points, points + n);

    int res = 1e3;
    for (int b = 0; b <= MAX_R; b += 2) {
        int cnt[MAX_Q + 1] {};
        
        for (int i = 0; i < n; i++) {
            int y = points[i].second;
            if (y > b) {
                cnt[1]++;
            } else {
                cnt[4]++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == 0 || points[i].first != points[i - 1].first) {
                int max_cnt = 0;
                for (int j = 1; j <= MAX_Q; j++) {
                    max_cnt = max(max_cnt, cnt[j]);
                }
                res = min(res, max_cnt);
            }

            int y = points[i].second;
            if (y > b) {
                cnt[1]--;
                cnt[2]++;
            } else {
                cnt[4]--;
                cnt[3]++;
            }
        }
    }

    cout << res;
    return 0;
}