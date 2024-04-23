#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

int n, key, value;
string cmd;
unordered_map<int, int> m;

int main() {
    cin >> n;
    while(n-- > 0) {
        cin >> cmd;
        if (cmd == "add") {
            cin >> key >> value;
            m[key] = value;
        } else if (cmd == "find") {
            cin >> key;
            if (m.find(key) != m.end()) {
                cout << m[key] << endl;
            } else {
                cout << "None" << endl;
            }
        } else if (cmd == "remove") {
            cin >> key;
            m.erase(key);
        }
    }
    return 0;
}