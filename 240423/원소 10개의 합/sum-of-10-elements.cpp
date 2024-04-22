#include <iostream>

using namespace std;

int main() {

    int sum_val = 0, val;
    for (int i = 1; i <= 10; i++) {
        cin >> val;
        sum_val += val;
    }

    cout << sum_val;
    
    return 0;
}