#include<bits/stdc++.h>

using namespace std;

const int N = 1e6;
int a[N+5], b[N+5];
int main()
{
	int n, m;//两个整数序列的长度 
	cin >> n >> m;
	for( int i = 1 ; i <= n ; i++ ) cin >> a[i];
	for( int i = 1 ; i <= n ; i++ ) cin >> b[i];
	
	sort(a+1, a+1+n);
	sort(b+1, b+1+n);
	
	for( int i = 1 ; i <= n ; i++ )
	{
		for( int j = 1;  j <= m ; j++ )
		{
			if( a[i] == b[j] )
			{
				cout << a[i] << " ";
			}
		}
	}
	cout << endl;
}
