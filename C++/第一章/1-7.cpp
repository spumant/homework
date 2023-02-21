#include<bits/stdc++.h>

using namespace std;

map<int, int>mp;
int main()
{
	int n;
	cin >> n;
	for( int i = 1 ; i <= n ; i++ )
	{
		int x;
		cin >> x;
		mp[x]++;
	}
	int f = 0;
	for( auto j : mp )
	{
		if( j.second >= (n+1)/2 )
		{
			f = 1;
		}
	}
	if( f ) cout << "存在元素出现次数超过所有元素个数的一半";
	else cout << "不存在元素出现次数超过所有元素个数的一半";
}
