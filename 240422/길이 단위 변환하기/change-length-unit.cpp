#include <iostream>

using namespace std;

int main() {
    
    double ft = 30.48;
    int mi = 160934;

    cout << fixed;
    cout.precision(1);
    
    cout << "9.2ft = " << 9.2 * ft << "cm" << endl;
    cout << "1.3mi = " << 1.3 * mi << "cm" << endl;

    return 0;
}