#include <iostream>
#include <unordered_map>
#include <string>
#include <cctype>

using namespace std;

int n, m;
string s;
unordered_map<string, int> sm;
unordered_map<int, string> nm;

int main() {
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        cin >> s;
        sm[s] = i;
        nm[i] = s;
    }

    for (int i = 0; i < m; i++) {
        cin >> s;
        if (isdigit(s[0])) {
            cout << nm[stoi(s)] << endl;
        } else {
            cout << sm[s] << endl;
        }
    }

    return 0;
}