자동차 class를 만들어요
-

자동차에는 엔진이 있고, 바퀴도 있어요.

엔진에는, 1600cc 엔진도 있고, 2000cc 엔진이 등등 여러 출력의 엔진이 있어요.

하지만 자동차가 특정엔진에 의존하게 된다면, 다른엔진을 사용하고 싶을 때

class를 수정해야 하는 상황이 발생하게 되요.

이건 DIP(의존성역전원칙)에 위배되요.
-

- 자동차가 엔진 class에 의존하고 있기 때문이에요.

1600cc, 2000cc 엔진을 상속하고있는 엔진클래스를 정의해서 자동차 class에 속성으로 포함하면, 자동차 객체를 생성할 때, 내가 원하는 엔진으로
만들어 줄 수 있어요. 

그러면 자동객체가 엔진객체에 의존하지 않아도 되요. 왜냐하면 필요할 때 원하는 엔진으로 만들어 줄 수 있기 때문이에요.

---
