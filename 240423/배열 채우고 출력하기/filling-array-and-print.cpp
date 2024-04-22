#include <iostream>

using namespace std;

int main() {
    char chars[10];
    for (int i = 0; i < 10; i++) {
        cin >> chars[i];
    }

    for (int j = 9; j >= 0; j--) {
        cout << chars[j];
    }

    return 0;
}