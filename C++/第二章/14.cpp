/*
���ڲ���ͷ���ķǿյ�����L,
���һ���ݹ��㷨���ص�һ��ֵΪx�Ľڵ�ĵ�ַ��
��û�������Ľڵ㷵��NULL 
*/

#include<bits/stdc++.h>

using namespace std;
set<int>s;
const int N = 1e6;
struct node
{
	int v, next;
}a[N];

int ans;
void dg_shuchu( int x, int num )
{
	if( a[x].next == -1 ) 
	{
		if( a[x].v == num && ans == 0) ans = a[x].next;
		return ;
	}
	else
	{
		if( a[x].v == num &&  ans == 0) ans = a[x-1].next;
		dg_shuchu(a[x].next, num);
	}
}
int main()
{
	
	int n;//����n������ 
	cin >> n;
	for( int i = 1 ; i <= n ; i++ )
	{
		cin >> a[i].v;
		a[i].next = i+1;
	}
	int num;
	cin >> num;
	a[0].next = 1;
	a[n].next = -1;
	dg_shuchu(1, num);
	
	if( ans == 0 ) cout << "NULL";
	else cout << ans;
}
