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
	if( f ) cout << "����Ԫ�س��ִ�����������Ԫ�ظ�����һ��";
	else cout << "������Ԫ�س��ִ�����������Ԫ�ظ�����һ��";
}
