#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int n, res = 0;
string s;
unordered_map<string, int> map;

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> s;
        map[s]++;
        res = map[s] > res ? map[s] : res;
    }
    cout << res;
    return 0;
}