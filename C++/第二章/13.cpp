/*
对于不带头结点的非空单链表L,
设计一个递归算法返回最大值节点的地址（假设这样的节点唯一）。 
*/

#include<bits/stdc++.h>

using namespace std;
set<int>s;
const int N = 1e6;
struct node
{
	int v, next;
}a[N];

int mx;
void dg_shuchu( int x  )
{
	if( a[x].next == -1 ) 
	{
		mx = max(a[x].v, mx);
		if( a[x].v == mx ) s.insert(a[x-1].next);
		return ;
	}
	else
	{
		mx = max(mx, a[x].v );
		dg_shuchu(a[x].next);
		if( a[x].v == mx ) s.insert(a[x-1].next);
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
	a[0].next = 1;
	a[n].next = -1;
	dg_shuchu(1);
	
	for( auto j:s ) 
		cout << j << " ";
}
