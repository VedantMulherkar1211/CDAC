/*
Counting the spaces in the string taken from user
*/
#include <iostream>
#include <string>
using namespace std;
int countspace(string arr);
int main()
{
    string arr;
    cout << "Enter the string";
    cin >> arr;
    int space = countspace(arr);
    cout << space;
}

int countspace(string arr)
{
    int cnt = 0;
    for (int i = 0; i < arr.length(); i++)
    {
        if (arr[i] == ' ')
        {
            cnt++;
        }
    }
    return cnt;
}
