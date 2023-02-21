#include<bits/stdc++.h>

using namespace std;

const int N = 1e6;
int vis[N+5], pri[N+5];
int cnt;
void prime( int top )
{

	for( int i = 2 ; i <= top ; i++ )
	{
		if( vis[i] == 0 )
		{
			pri[++cnt] = i;
			vis[i] = i;	
			for( int j = 2*i ; j <= top ; j += i )
			{
				vis[j] = i;
			}
		}
		
	}
}
int main()
{
	int n, f, x;
	cin >> n;
	prime(n);
	vector<int>ans; 
	while( n != vis[n] && n != 1 )
	{
		f = vis[n];
		while( n%f == 0 )
		{
			ans.push_back(f);
			n /= f;
		}
	}
	if( n != 1 )
		ans.push_back(n);
	for( auto v:ans ) cout << v << " ";
}
