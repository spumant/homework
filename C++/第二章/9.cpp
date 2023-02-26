/*
对于一个采用字符数组存放的字符串str,
设计一个递归算法求其字符个数(长度) 
*/

#include<bits/stdc++.h>

using namespace std;
string s;
int ans;

void digui( int x )
{
	if( s[x] == '\0' )
		return ;
	digui(x+1);
	ans++;
}
int main()
{
	
	cin >> s;
	digui(0);
	cout << "递归算出字符串的长度为: " << ans;	
}
