/*
对于不带头结点的非空单链表L,
设计一个递归算法返回第一个值为x的节点的地址，
若没有这样的节点返回NULL 
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
	
	int n;//输入n个数字 
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
