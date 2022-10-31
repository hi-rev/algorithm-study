## substring
Java에서 문자열을 원하는 위치에서 잘라야 할 때 사용하는 함수이다.
문자열을 다루어야 하는 문제에서 자주 사용된다.
```S_2007.java```에서 반복되는 문자열의 길이를 찾기 위해서 substring 함수를 사용하였다.

### String substring(int beginIndex, int endIndex)
```
String s = "Hello World!";
System.out.println(s.substring(0, 5));
```
위 코드를 실행하면 문자열의 0번째 부터 4번째까지의 문자열을 추출한다. 따라서 ```Hello```가 출력될 것이다.


## toCharArray()
문자열을 입력 받아서 각각의 문자 배열로 나타내야 할 때가 있다.
그럴 때 사용하는 것이 ```toCharArray```이다.

문제 ```S_1989.java```에서는 문자열을 배열로 나눠 각각의 문자가 대칭이 맞는지 비교하는데 사용되었다.

보통 문자열에서 문자 하나를 얻고자 할 때 ```charAt```을 사용하기도 한다.
이는 문자열 인덱스를 통해 하나의 문자를 얻는 것이고, ```toCharArray```는 문자열로 문자 배열을 만드는 것이므로 잘 구별하도록 하자.

```
String s = "abcde";
char[] arr = s.toCharArray();
```
위와 같이 사용하면, 문자 배열을 얻을 수 있다.

