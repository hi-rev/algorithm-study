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
