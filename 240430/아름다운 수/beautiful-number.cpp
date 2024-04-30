#include <iostream>

using namespace std;

int n, res;

bool is_beautiful(int* arr) {
	for(int i = 0; i < n; i += arr[i]) {
		if (i + arr[i] - 1 >= n) {
            return false;
        }

        for (int j = i; j < i + arr[i]; j++) {
            if(arr[j] != arr[i]) {
                return false;
            }
        }
	}
	return true;
}

void count_beautiful_seq(int depth, int* arr) {
	if(depth == n) {
		if(is_beautiful(arr))
			res++;
		return;
	}
	
	for(int i = 1; i <= 4; i++) {
		arr[depth] = i;
		count_beautiful_seq(depth + 1, arr);
	}
}


int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> n;
	int* arr = new int[n];

	count_beautiful_seq(0, arr);

	cout << res;
	return 0;
}