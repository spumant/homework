/*
���ڲ���ͷ���ĵ�����L,
���һ���ݹ��㷨����������нڵ�ֵ 
*/

#include<bits/stdc++.h>

using namespace std;

const int N = 1e6;
struct node
{
	int v, next;
}a[N];


void dg_shuchu( int x )
{
	if( a[x].next == -1 ) 
	{
		cout << a[x].v << " ";
		return ;
	}
	else
	{
		
		cout << a[x].v << " ";
		dg_shuchu(a[x].next);
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
	a[n].next = -1;
	dg_shuchu(1);
}
