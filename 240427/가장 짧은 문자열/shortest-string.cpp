#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

int main() {

    int max_result{0};
    int min_result{20};

    string strs[3];
    for (int i = 0; i < 3; i++) {
        cin >> strs[i];
    }

    for (const auto& str: strs) {
        max_result = max(max_result, (int)str.size());
        min_result = min(min_result, (int)str.size());
    }

    cout << max_result - min_result;
    return 0;
}