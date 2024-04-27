#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    string str1, str2;
    getline(cin, str1);
    getline(cin, str2);

    str1.erase(remove(str1.begin(), str1.end(), ' '), str1.end()); 
    str2.erase(remove(str2.begin(), str2.end(), ' '), str2.end());

    cout << str1 << str2;
    return 0;
}