/*
����һ�������ַ������ŵ��ַ���str,
���һ���ݹ��㷨�����ַ�����(����) 
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
	cout << "�ݹ�����ַ����ĳ���Ϊ: " << ans;	
}
