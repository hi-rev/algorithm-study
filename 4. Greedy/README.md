# Greedy Algorithm
**그리디 알고리즘(Greedy Algorithm)** 이란, **탐욕법**이라고도 하며, 여러 경우 중 하나를 결정해야 할 때마다
그 순간에 최적이라고 생각되는 것을 선택해 나가는 방식으로 진행하여 최종적인 해답에 도달한다.

순간마다 하는 선택은 그 순간에는 최적의 선택이지만,
선택들을 모아서 최종적인 결론을 냈을 때, 그 해답이 최적이라고는 할 수 없다.
따라서 그리디 알고리즘을 적용할 수 있는 문제들은 지역적으로 최적이면서 전역적으로 최적인 문제들이다.

Greedy란 '탐욕스러운'이라는 의미를 가지고 있으며,
이름 그대로 탐욕스럽게 바로 **눈 앞의 최선의 경로**만을 찾아간다고 이해하면 기억하기 쉬울 것이다.

### 탐욕 알고리즘을 적용하기 위한 2가지 조건
1. 탐욕적 선택 속성(Greddy Chice Property) : 앞의 선택이 이후의 선택에 **영향을 주지 않는다.**
2. 최적 부분 구조(Optimal Substructure) : 문제에 대한 **최종 해결 방법**은 **부분 문제에 대한 최적 문제 해결 방법**으로 구성된다.

이 조건이 성립하지 않는다면, 그리디 알고리즘은 최적해를 찾을 수 없을 것이다.
하지만 이 경우 역시 어느 정도 최적해에 가까운 해를 구할 수 있는지를 보장하려면 엄밀한 증명이 필요하다.

또한 어떤 특별한 구조가 있는 문제에 대해서는 그리디 알고리즘이 항상 최적해를 찾아낼 수 있는데,
이를 **매트로이드**라고 한다.

[Reference]
https://ko.wikipedia.org/wiki/%ED%83%90%EC%9A%95_%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98

https://hanamon.kr/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%83%90%EC%9A%95%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-greedy-algorithm/
