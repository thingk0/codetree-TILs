#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int n, res;
vector<int> seq;

bool is_beautiful() {
	for(int i = 0; i < n; i += seq[i]) {
		if (i + seq[i] - 1 >= n) {
            return false;
        }

        for (int j = i; j < i + seq[i]; j++) {
            if(seq[j] != seq[i]) {
                return false;
            }
        }
	}
	return true;
}

void count_beautiful_seq(int cnt) {
	if(cnt == n) {
		if(is_beautiful())
			res++;
		return;
	}
	
	for(int i = 1; i <= 4; i++) {
		seq.push_back(i);
		count_beautiful_seq(cnt + 1);
		seq.pop_back();
	}
}


int main() {
	cin >> n;
	count_beautiful_seq(0);
	cout << res;
	return 0;
}