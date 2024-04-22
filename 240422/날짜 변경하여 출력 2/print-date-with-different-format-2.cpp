#include <iostream>

using namespace std;

int main() {
    
    int mm, dd, yyyy;
    char ch;

    cin >> mm >> ch >> dd >> ch >> yyyy;
    ch = '.';

    cout << yyyy << ch << mm << ch << dd;

    return 0;
}