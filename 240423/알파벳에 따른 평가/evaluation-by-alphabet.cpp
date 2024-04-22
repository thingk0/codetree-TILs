#include <iostream>

using namespace std;

int main() {
    char n;
    cin >> n;
    if (n == 'S') {
        cout << "Superior";
    } else if (n == 'A') {
        cout << "Excellent";
    } else if (n == 'B') {
        cout << "Good";
    } else if (n == 'C') {
        cout << "Usually";
    } else if (n == 'D') {
        cout << "Effort";
    } else {
        cout << "Failure";
    }
    return 0;
}