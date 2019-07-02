# 디자인 패턴 (Design Pattern)

![GOF Types](./docs/gof_types.png)

## 생성 패턴 (Creational Pattern)

> 객체를 생성하는데 관련된 패턴들
> 객체가 생성되는 과정의 유연성을 높이고 코드의 유지를 쉽게 함


### [팩토리 메서드 패턴 (Factory Method Pattern)](./src/main/java/com/jaeyeonling/designpattern/factorymethod)

구조와 구현의 분리

#### 예제 요구사항

* 게임 아이템 생성 (체력 회복 물약, 마법 회복 물약)

* 아이템 생성 후 아이템 복제 방지를 위해 로깅


### [싱글턴 패턴 (Singleton Pattern)](./src/main/java/com/jaeyeonling/designpattern/singleton)

하나의 인스턴스만 생성

하나만 생성해야할 객체를 위한 패턴

#### 예제 요구사항

* 스피커에 접근할 수 있는 객체를 1개로 제한


### [프로토타입 패턴 (Prototype Pattern)](./src/main/java/com/jaeyeonling/designpattern/prototype)

복잡한 인스턴스를 복사

생산 비용이 높은 인스턴스를 복사

깊은 복사와 얕은 복사의 차이를 아는게 가장 중요하다.

#### 예제 요구사항

* 일러스그림 그리기 툴

* 어떤 모양으로 그릴 수 있도록 하고 복사 붙여넣기 기능 구현

* 복사 후 붙여넣기 시 두 도형이 겹치지 않도록 옆으로 이동 

###### 비용이 높아지는 이유?

1. 종류가 너무 많아서 클래스로 정리되지 않는 경우

2. 클래스로부터 인스턴스 생성이 어려운 경우 


### [빌더 패턴 (Builder Pattern)](./src/main/java/com/jaeyeonling/designpattern/builder)

복잡한 단계가 있는 인스턴스 생성과정 단순화

복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴

많은 멤버 변수를 가진 객체 생성

많은 변수를 가진 객체의 생성을 가독성 높도록 개발 가능

#### 예제 요구사항

* 컴퓨터 생성


### [추상 팩토리 패턴 (Abstract Factory Pattern)](./src/main/java/com/jaeyeonling/designpattern/abstractfactory)

객체 생성의 가상화

#### 예제 요구사항

* 자전거를 만드는 공장



## 구조 패턴 (Structural Pattern)

> 프로그램 구조에 관련된 패턴들
> 프로그램 내의 자료구조나 인터페이스 구조 등 프로그램의 구조를 설계하는데 활용할 수 있는 패턴들


### [브릿지 패턴 (Bridge Pattern)](./src/main/java/com/jaeyeonling/designpattern/bridge)

기능 계층과 구현 계층의 분리

#### 예제 요구사항

* 모스부호 구현


### [조합 패턴 (Composite Pattern)](./src/main/java/com/jaeyeonling/designpattern/composite)

컨테이너와 내용물을 같게 다루기

#### 예제 요구사항

* 파일 시스템


### [데코레이터 패턴 (Decorator Pattern)](./src/main/java/com/jaeyeonling/designpattern/decorator)

동적으로 책임 추가

#### 예제 요구사항

* 커피 제조

ex)
* 에스프레소: 커피의 기본
* 아메리카노: 에스프레소 + 물
* 카페라떼: 에스프레소 + 스팀밀크
* 헤이즐넛: 아메리카노 + 헤이즐넛 시럽
* 카페모카: 카페라떼 + 초콜릿
* 캬라멜 마끼아또: 카페라떼 + 캬라멜 시럽


### [퍼사드 패턴 (Facade Pattern)](./src/main/java/com/jaeyeonling/designpattern/facade)

복잡한 과정을 간단하게 표현

단순한 접근

#### 예제 요구사항

* 공장 시스템 


### [플라이웨이트 패턴 (Flyweight Pattern)](./src/main/java/com/jaeyeonling/designpattern/flyweight)

메모리 공간을 절약

#### 예제 요구사항

* Flyweight 생성


### [대리 패턴 (Proxy Pattern)](./src/main/java/com/jaeyeonling/designpattern/proxy)

작업을 나눠서 구현

#### 예제 요구사항

* 가벼운 작업을 프록싱


## 행위 패턴 (Behavioral Pattern)

> 반복적으로 사용되는 객체들의 상호작용을 패턴화 해놓은 것들

### [전략 패턴 (Strategy Pattern)](./src/main/java/com/jaeyeonling/designpattern/strategy)

전략 바꾸기

여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서 서로 교환 가능하도록 함

#### 예제 요구사항

* 캐릭터는 무기를 착용 가능

* 착용한 무기로 공격 가능


### [템플릿 메소드 패턴 (Template Method Pattern)](./src/main/java/com/jaeyeonling/designpattern/templatemethod)

공통적인 프로세스를 묶어 주기

알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는 패턴

#### 예제 요구사항

* 게임의 접속을 구현
    
* 유저가 게임 접속 시 여러 사항을 고려 

ex) 보안 과정, 인증 과정, 권한 과정, 접속 과정


### [방문자 패턴 (Visitor Pattern)](./src/main/java/com/jaeyeonling/designpattern/visitor)
 
객체에서 처리를 분리

#### 예제 요구사항 

* 방문자들의 나이의 총합을 구함


### [책임사슬 패턴 (Chain Of Responsibility)](./src/main/java/com/jaeyeonling/designpattern/chainofresponsibility)

다양한 처리 방식을 유연하게 연결

동적으로 처리

#### 예제 요구사항 

* 사칙연산

* 무기와 방패 


### [옵저버 패턴 (Observer Pattern)](./src/main/java/com/jaeyeonling/designpattern/observer)

이벤트 발생 후 객체 외부에서 처리

#### 예제 요구사항 

* 버튼 클릭


### [중재자 패턴 (Mediator Pattern)](./src/main/java/com/jaeyeonling/designpattern/mediator)

복잡한 관계를 간단한 관계로 구현

M:N 을 1:1 으로 변경

#### 예제 요구사항

* 메시징 시스템


### [상태 패턴 (State Pattern)](./src/main/java/com/jaeyeonling/designpattern/state)

상태를 객체로 나타내기

#### 예제 요구사항

* 불 켜고 끄기


### [메멘토 패턴 (Memento Pattern)](./src/main/java/com/jaeyeonling/designpattern/memento)

상태를 저장하고 이전 상태로 복구 가능

#### 예제 요구사항

* 상태 기억하기


### [명령 패턴 (Command Pattern)](./src/main/java/com/jaeyeonling/designpattern/command)

명령을 객체화

#### 예제 요구사항

* 문자열 출력 

