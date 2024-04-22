#include <iostream>

using namespace std;
const double ft = 30.48;

int main() {
    double n;
    cin >> n;

    cout << fixed;
    cout.precision(1);
    cout << n * ft;
    return 0;
}