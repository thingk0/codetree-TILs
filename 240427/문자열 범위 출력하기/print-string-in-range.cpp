#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    getline(cin, str);
    cout << str.substr(2, 8);
    return 0;
}