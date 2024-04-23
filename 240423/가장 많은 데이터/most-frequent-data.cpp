#include <iostream>
#include <string>
#include <unordered_map>
#include <algorithm>

int main() {
    int n, res = 0;
    std::string s;
    std::unordered_map<std::string, int> map;

    std::cin >> n;
    for (int i = 0; i < n; i++) {
        std::cin >> s;
        map[s]++;
        res = std::max(res, map[s]);
    }
    std::cout << res;
    return 0;
}