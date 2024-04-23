#include <iostream>
#include <unordered_set>
#include <string>

using namespace std;

int n, k;
string cmd;

unordered_set<int> s;

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> cmd >> k;
        if (cmd == "find") {
            if (s.find(k) != s.end()) {
                cout << "true" << endl;
            } else {
                cout << "false" << endl;
            }
        } else if (cmd == "add") {
            s.insert(k);
        } else if (cmd == "remove") {
            s.erase(k);
        }
    }
    return 0;
}