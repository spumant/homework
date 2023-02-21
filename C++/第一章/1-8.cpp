#include<bits/stdc++.h>

using namespace std;

int main()
{
	string s;
	cin >> s;
	string s1  = s;
	reverse(s.begin(), s.end());
	
	if( s1 == s )
		cout << "该字符串是回文串";
	else
		cout << "该字符串不是回文串";
}
