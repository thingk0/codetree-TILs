#include <iostream>

using namespace std;

int main() {
    int a = 5, b = 6, c = 7;
    int  tmp;

    tmp = b;
    b = a;
    a = c;
    c = tmp;

    cout << a << endl << b << endl << c;    

    return 0;
}