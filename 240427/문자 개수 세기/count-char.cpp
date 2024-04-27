#include <iostream>
#include <string>

using namespace std;

int main() {
    
    string str;
    getline(cin, str);

    char ch;
    cin >> ch;

    int cnt{0};
    for (const char& c : str) {
        if (c == ch) {
            cnt++;
        }
    }

    cout << cnt;
    return 0;
}