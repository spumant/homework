/*
对于一个采用字符数组存放的字符串str,
设计一个递归算法求判断str是否回文。 
*/

#include<bits/stdc++.h>

using namespace std;
string s;
bool flag = true;

void digui( int idx, int len )
{
	if( idx == len )
	{
		return ;
	}
	digui(idx+1, len);
	if( s[len-idx-1] != s[idx] )
		flag = false;
}
int main()
{
	
	cin >> s;
	digui(0, s.size());
	if( !flag ) cout << "str不是回文字符串";
	else cout << "str是回文字符串";
}
