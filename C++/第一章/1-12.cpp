#include<bits/stdc++.h>
using namespace std;
const int N = 1e6;
vector<int>a;
int main()
{
	int n;
	cin >> n;
	for( int i = 1 ; i <= n ; i++ )
	{
		int x;cin >> x;
		a.push_back(x);
	}
	
	int ans = 0;
	sort(a.begin(), a.end());
	for( int i = 0 ; i < a.size() - 1 ; i++ )
	{
		if( a[i] = a[i+1] - 1 ) ans++;
	}
	cout << ans;
}
