#include<bits/stdc++.h>

using namespace std;

map<int, int>mp;
int main()
{
	int n, k;
	//n为整数序列的长度.
	// k 为所给的整数 
	cin >> n >> k;
	mp.clear();
	for( int i = 1 ; i <= n ; i++ )
	{
		int x;
		cin >> x;
		mp[x]++;
	}
	
	int f = 0;
	for( int i = 1 ; i <= k/2 ; i++ )
	{
		if( mp[i] > 0 )
		{
			int x = k-i;
			if( x == i )
			{
				if( mp[i] > 1 ) f = 1;
				else continue;
			}
			if( mp[x] > 0 ) 
			{
				f = 1;
			}
		}
	}
	if( f == 1) cout << "存在两个元素之和刚好等于整数k";
	else cout << "不存在两个元素之和刚好等于整数k";  
}
