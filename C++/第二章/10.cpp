/*
����һ�������ַ������ŵ��ַ���str,
���һ���ݹ��㷨���ж�str�Ƿ���ġ� 
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
	if( !flag ) cout << "str���ǻ����ַ���";
	else cout << "str�ǻ����ַ���";
}
