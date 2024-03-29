# study_java_repository
java study

## 상속
+ 기존 클래스를 재사용하여 새로운 클래스를 작성하는 것
+ 상속을 사용하면 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리할 수 있다
+ 따라서, 코드 추가 및 변경이 쉬워진다
+ 코드의 재사용성을 높이고 코드의 증복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다

![상속_다이어그램1](https://user-images.githubusercontent.com/42866800/194790289-f041c3a8-7fed-4caa-aaa2-8d14dd9e35cd.png)

+ 상속 해주는 클래스를 조상 클래스 라고 하고 상속 받는 클래스를 자손 클래스 라고 한다
+ 자손 클래스는 조상 클래스의 모든 멤버를 상속받기 때문에 SmartTv 클래스는 Tv 클래스의 멤버들을 포함한다
+ Tv 클래스에 필드가 추가되면 SmartTv 클래스는 부모클르새의 멤버를 모두 상속 받기 떄문에 자동적으로 멤버변수가 추가된 것과 같은 효과를 얻는다
+ 항상 부모 클래스 보다 같거나 많은 멤버를 갖는다
+ 즉 , 상속을 거듭할 수 록 상속받는 클래스의 필드 개수는 점점 늘어나게 된다
  
![상속_포함관계](https://user-images.githubusercontent.com/42866800/194790286-0576eade-54fc-4929-87c0-a580cb1f8797.png)  

+ 그래서 상속 받는다는 것을 부모 클래스를 확장 한다는 의미로 해석할 수 있다
+ 이떄문에 , 상속에 사용되는 키워크가 extends이다

## 추상 클래스
+ 추상클래스 : 미완성 설계도
+ 미완성 메서드(추상메서드)를 포함하고 있다
+ 추상 클래스로 인스턴스를 생성할 수 없다
+ 추상 클래스는 상속을 통해 자손클래스에 의해서만 완성될 수 있다
+ 즉 , 추상 클래스 자체로는 클래스로서 역할을 못하지만 , 새로운 클래스를 작성할때 바팅이 되는 역할을 한다
+ abstract 키워드를 보고 해당 클래스에 추상메서드가 있으니 상속을 통해 구현해줘야 한다는 것을 알수 있게 된다
+ 추상 클래스는 추상 메서드를 포함하고 있다는 것을 제외하고 일반 클래스와 전혀 다르지 않다
+ 추상 클래스에도 생성자가 있으며, 멤ㅁ버변수와 메서드도 가질 수 있다

### 추상 메서드
+ 선언부만 작성하고 구현부는 작성하지 않은 채로 남겨 둔 것
+ 즉 , 설계만 해놓고 실제 수행될 내용은 작성하지 않았기 떄문에 미완성 메서드이다

### 왜 메서드를 미완성 상태로 남겨 놓는가??
+ 메서드의 구현부가 상속받는 클래스에 따라 달라질 수 있기 때문이다
+ 따라서 , 부모 클래스에서는 선언부만 작성하고 어떤 기능을 수행할 목적으로 작성되었는지만 알려주고 실제 내용은 상속받는 클래스에서 구현 하도록 비워둔다
+ 그래서 추상클래스를 상속받는 자손 클래스는 추상 메서드를 상황에 맞게 구현해 줘야 한다

## 인터페이스
+ 인터페이스는 일종의 추상 클래스이다
+ 인터페이슨느 추상클래스처럼 추상메서드를 갖니만 추상클래스보다 추상화 정보가 높아서 추상클래스와 달리 구현부를 갖춘 일반 메서드 또는 멤버변수를 가질 수 없다
+ 오직 추상메서드와 상수만을 멤버로 가질 수 있고 , 그 외의 다른 요소는 허용하지 않는다
+ 인터페이스도 추상클래스 처럼 완성되지 않은 불완전한 것이기 때문에 다른 클래스를 작성하는데 도움을 줄 목적으로 작성된다

### 인터페이스의 상속
+ 자식 인터페이스는 부모 인터페이스에 정의된 멤버를 모두 상속받는다

### 인터페이스의 구현
+ 인터페이스도 추상클래스 처럼 그 자체로는 인스턴스를 생성할 수 없다
+ 인터페이스도 추상메서드의 몸통을 만들어주는 클래스를 작성해야 한다
+ 이를 인터페이스를 구현한다는 의미의 키워드 implements를 사용한다
+ 만일 구현하는 인터페이스의 메서드 중 일부만 구현한다면, abstract를 붙여 추상클래스로 선언해야 한다



# 01월 14일
+  자바 환경 설정 및 IDE 설치
+  자바의 특징 및 자바 프로그램 기본 작성 흐름 정리
+  [자바의 특징과 기본 작성 흐름](https://unique-wandflower-4cc.notion.site/ch1-4a3c259209ff4c9dbbcca90d265df25a)



# 01월 21일
## 잘된점
+ 자바 HashMap 개념정리 및 문제풀이
+ 문자열 관련 알고리즘 2문제 풀기 및 정리
+ 프로그래머스에서 HashMap 관련 문제 풀이 및 정리
+[HashMap 정리 내용](https://unique-wandflower-4cc.notion.site/HashMap-69fb1d9e5dcf4de9bad7e85b6f5dbeb2)
+[자바 문자열 관련 알고리즘 문제풀이](https://unique-wandflower-4cc.notion.site/a1ab91cf6b7e45e2bc0fb04e2fd46f53)
+[프로그래머스 완주하지 못한 선수 문제풀이](https://unique-wandflower-4cc.notion.site/9dba2e288d164c54899eb2945e9651ed)
  
## 배운점
+ toCharArray 메서드를 사용하면 반복문 없이 문자열을 char 타입의 배열로 만들어 준다
+ toLowerCase 메서드를 사용하면 문자열 혹은 특정 문자를 소문자로 바꿀수 있다
+ toUpperCase 메서드를 사용하면 문자열 혹은 특정 문자를 대문자로 바꿀수 있다
+ HashMap을 반복 순회하기 위해 Iterator를 사용한다
+ entrySet 메서드를 사용하면 HashMap의 key , value쌍을 추출할 수 있다

## 개선할점
+ HashMap의 getOrDefault 메서드를 정확히 이해하고 실습 해본후에 완주하지 못한 선수 다시 도전해볼것


# 01월 22일

## 잘된점
+ 자바 문자열 관련 알고리즘 4문제 풀기 및 정리

## 배운점
+ 문자열 관련 메서드 split , subString , indexOf에 대한 이해
+ Character 클래스의 isAplabetic 메서드를 사용하면 문자의 알파벳 유무를 판별할 수 있다
+ 문자열에 대해 charAt 메서드를 사용하면 특정 문자의 인덱스를 알아낼 수 있다

## 정리내용
+ [문장 속 단어](https://unique-wandflower-4cc.notion.site/3-2fff7c524dae4aa188c2a9e226dc8077)
+ [단어 뒤집기](https://unique-wandflower-4cc.notion.site/4-ace207ae20984892bc2a176908173c3c)
+ [특정 문자 뒤집기](https://unique-wandflower-4cc.notion.site/5-e113926190c34159bcb9926feaf67393)
+ [중복 문자 제거](https://unique-wandflower-4cc.notion.site/6-f9230922a0e342d9be5a5ae150b3b679)



## 개선할점
+ 코드의 양을 줄이고 효율적으로 메서드를 활용하어 작성하는 방법에 대한 고민
+ 문자열 관련 메서드를 활용할 수 있도록 많은 연습 필요


# 01월 23일

## 잘된점
+ 자바 문자열 관련 알고리즘 3문제 풀고 정리

## 정리내용
+ [회문 문자열](https://unique-wandflower-4cc.notion.site/7-264b01ca2d3f45fe9f5ccea0a181d674)
+ [팬린드롬](https://unique-wandflower-4cc.notion.site/8-07604d92c83a40b8afdb7dfb4cf4462d)
+ [숫자만 추출](https://unique-wandflower-4cc.notion.site/9-3df5c496b33a4d43943e10d3757e4557)

## 개선할 점
+ 문제를 많이 푸는것도 중요하지만 원리를 아는 것도 중요하다
+ 직접 그림을 그려보면서 확실하게 이해하고 다른 문제에 적용할 수 있도록 계속 연습해야 겠다


# 01월 24일
## 잘된점
+ 반복문에 대한 이해 및 문제풀이
+ 배열에 대한 이해 및 문제풀이
+ [반복문 정리](https://unique-wandflower-4cc.notion.site/ch5-944dafff6985435fb669c4ca8e32a51f)
+ [배열 정리](https://unique-wandflower-4cc.notion.site/ch6-83f145eb199a48d9ae45a2f9d157d26c)
+ [문자열 암호 문제](https://unique-wandflower-4cc.notion.site/12-8c8ac03652de41deaac762d833317d63)
+ [배열 큰수 출력](https://unique-wandflower-4cc.notion.site/1-d18268d09af546f29fa05b059d4b0b5c)

## 배운점
+ startsWith 메서드를 사용하면 대상 문자열이 특정 문자 또는 문자열로 시작하는지 알수 있다
+ [프로그래머스 전화번호 목록](https://unique-wandflower-4cc.notion.site/af4dfc002c1e4c8094de233539de48a1)

## 개선할 점
+ 처음부터 풀이가 떠오르지 않는다고 조급해 하지 말자 이제 알고리즘 공부한지 5일 되었다
+ 다른 사람풀이를 보고 왜 이렇게 풀었을지 고민하고 내것으로 만드는 것도 공부다
+ 화이팅!!


# 01월 25일
## 잘된점
+ 생성자를 통해 객체를 생성하는 과정에 대한 이해
+ 접근제한하를 통해 외부에서 접근을 제한하고 이를 우회하는 게터/세터 메서드 사용방법에 대한 이해
+ 배열을 사용하여 알고리즘 2문제 풀고 정리

## 배운점
+ [클래스를 통해 객체를 생성하는 방법](https://unique-wandflower-4cc.notion.site/ch7-c8e301fb0f314152977d65064b8bfc7a)
+ [접근제한자의 목적과 이를 우회하는 방법](https://unique-wandflower-4cc.notion.site/ch8-0775df221bc246f0bbca355a54b633d8)
+ [배열을 사용한 알고리즘 문제풀이 1.](https://unique-wandflower-4cc.notion.site/2-27deff89685746cfb795eafdca151224)
+ [배열을 사용한 알고리즘 문제풀이 2.](https://unique-wandflower-4cc.notion.site/3-a7e9545b79794b8c923ce015ee0bde94)

## 개선할점
+ 배열에서 중복된 값을 제거하는 로직에 대한 고민 필요


# 01월 26일
## 잘된점
+ 상속 개념에 대한 이해와 문제풀이
+ 베열관련 알고리즘 두문제 풀고 정리
+ [피보나치 수열](https://unique-wandflower-4cc.notion.site/4-9bdf065c02f942fe93609108daf7f879)
+ [소수 판별하기](https://unique-wandflower-4cc.notion.site/5-c9d314e84e16434a988b47042898c23d)

## 배운점
+ [상속의 특징](https://unique-wandflower-4cc.notion.site/ch10-147fe25e1ee94979874ff8ed2872b33f)
+ [업캐스팅과 메서드 오버라이딩](https://unique-wandflower-4cc.notion.site/d3e564b7627549bba579e1cd8941a83e)
+ [상속과 생성자 호출](https://unique-wandflower-4cc.notion.site/917db96a26984fbab7b2983762e396cd)
+ [ths , super , protected](https://unique-wandflower-4cc.notion.site/this-super-protected-b78ce0b4e54f463eb013ba319b7fe904)


# 01월 27일

## 잘된점
+ ArrayList 와 Random 클래스를 사용하여 주사위 2개를 던졌을때 나올수 있는 눈의합을 계산하는 문제 해결
+ 자바 배열을 사용하여 숫자를 n개 입력받아 뒤집은후 소수인지 판단하는 문제 해결
+ 소수인지 판단하는 메서드 로직 작성
+ [자바 API 정리내용](https://unique-wandflower-4cc.notion.site/09-API-e8c4b8dc80174e78aa32df71e23127d9)
+ [자자 ArrayList와 Random 클래스를 사용하여 문제풀이](https://unique-wandflower-4cc.notion.site/7945e956da9b40749cba2c89ce364449)
+ [배열을 사용하여 뒤집은 숫자에 대한 소수인지 판단](https://unique-wandflower-4cc.notion.site/6-9ff6e6d235c745079ef45f9d2e01604b)


## 배운점
+ 자바 Math.Random 클래스 사용 방법에 대한 이해
+ API 가 무엇인지에 대한 이해
+ ArrayList 와 배열의 차이점에 대한 이해
+ StringBuffer 객체와 reverse 메서드를 사용하여 데이터를 뒤집는 방법

## 개선할 점
+ 소수인지 판단할 때 더 효율적으로 판단할수 있는 방법이 있는지 고민 필요


# 01월 28일

## 잘된점
+ 인터페이스의 사용목적과 사용방법에 대한 이해
+ 배열을 사용한 자바 알고리즘 3문제 해결
+ [등수 구하기](https://www.notion.so/8-738b66f84788440a82214930b7cff93d)
+ [격자판 최대합](https://www.notion.so/9-4af791e94aa34d16aa8f0be43d6c47e9)
+ [봉우리](https://www.notion.so/10-711683f941244928b751d02355d66b88)


## 배운점
+ [인터페이스의 역할과 사용방법](https://unique-wandflower-4cc.notion.site/ch11-5f35086f397b434397687b84f351d261)
+ [인터페이스와 다형성](https://unique-wandflower-4cc.notion.site/68548ec656c94466aa4ee6cfc1d11892)
+ [인터페이스에 올수 있는 메서드 종류](https://unique-wandflower-4cc.notion.site/53d9115b167243e1b31e210f0f3bad1c)

## 개선할점
+ 처음부터 잘할순 없다 꾸준히 하자!!


# 01월 29일
## 잘된점
+ 배열관련 알고리즘 2문제 풀기


# 01월 30일
## 잘된점
+ 자바 중복문자제거 알고리즘 문제 복습


# 01월 31일
## 잘된점
+ 자바 예외처리 정리 및 문제 풀이

## 배운점
+ 예외의 종류와 예외를 던져서 처리하는 방법
+ [자바 예외처리](https://unique-wandflower-4cc.notion.site/ch12-1dfc823bac4c4ce6bebfc6101747b122)


# 02월 01일
## 잘된점
+ 자바 파일입출력 정리 및 문제풀이
+ 자바 문자열 관련 알고리즘 3문제 풀고 정리
## 배운점
+ 파일입출력이란 무엇인가
+ 파일입출력에 사용되는 클래스와 클래스간 관계
+ charAt 메서드를 사용하여 특정 인덱스 위치의 문자를 반환받는다
+ indexOf 메서드를 사용하여 특정 문자가 가장 처음 나오는 인덱스를 반환받는다
+ [자바 파일 입출력 정리](https://unique-wandflower-4cc.notion.site/ch13-f6a2e9d4ce0a4d5bb23749acf5f2c69c)
+ [자바 특정문자 뒤집기](https://unique-wandflower-4cc.notion.site/5-cfe4be61ff3641df8af96c7ae0ee3b3a)
+ [자바 중복문자 제거](https://unique-wandflower-4cc.notion.site/6-fc19d0680c1e4ed0b1f2d544d5be662b)
+ [자바 회문문자열](https://unique-wandflower-4cc.notion.site/7-0f94585106d94fb88381280981fc7f19)


# 02월 02일
## 자바 영화얘매 프로그램
### 잘된점
+ 프로그램 기능 정리
+ 프로그램 시작점과 프로그램 종료점의 구조파악
+ [영화 얘매 프로그램 기능 및 시작 메뉴 구성](https://unique-wandflower-4cc.notion.site/ch14-a50c66672f624eb2bc5f37b3cb4ff6f3)

## 자바 문자열 알고리즘
### 잘된점
+ 문자열 알고리즘 3문제 풀고 정리
+ [유효한 팰린드롬](https://unique-wandflower-4cc.notion.site/8-09339df4525147e2a248c5c92b3b66db)
+ [숫자만 추출](https://unique-wandflower-4cc.notion.site/9-cda967f603de43c2be4ad4072e59c362)
+ [가장 짧은 문자거리](https://unique-wandflower-4cc.notion.site/10-f47b3c4aa87345a1b167fdc67134c57a)
### 배운점
+ replaceAll 메서드에 정규표현식을 사용하여 특정 조건을 만족하는 경우 이를 대체 문자로 치환시킨다
+ Character 클래스의 isDigit 메서드를 사용하여 char 타입의 문자가 숫자인지 여부를 판단한다



# 02월 03일
## 자바 영화 얘매 콘솔 프로그램

### 잘된점
+ 영화 얘매 콘솔 프로그램 기능 추가
+ 파일에서 영화 목록을 읽어와 콘솔에 보여준다
+ 관리자 영역은 관리자 암호를 올바르게 입력한 사람만 볼수 있도록 구현
+ [영화 애매 콘솔 프로그램](https://unique-wandflower-4cc.notion.site/ch14-a50c66672f624eb2bc5f37b3cb4ff6f3)

### 배운점
+ 파일 객체를 사용하여 moveis.txt 파일을 읽어온다
+ BufferedReader 객체를 사용하여 파일의 데이터를 한줄씩 읽어온다

## 자바 알고리즘
### 잘된점
+ 문자열 관련 알고리즘 2문제 풀고 정리
+ 배열 관련 알고리즘 1문제 풀고 정리
+ [문자열 압축](https://unique-wandflower-4cc.notion.site/11-d29f8bf310a34bbfbc62f9b906d48e6b)
+ [암호](https://unique-wandflower-4cc.notion.site/12-bfa610840f1347959b9fa514edc9f782)
+ [큰 수 출력하기](https://unique-wandflower-4cc.notion.site/1-122326ae37994904a12bbb9b9575d695)

### 배운점
+ int 형 데이터를 String 타입의 문자열로 만들때 Stirng 클래스의 valueOf 메서드를 사용한다
+ 문자열의 특정 위치부터 특정 위치까지 자르는 경우 substring 메서드를 사용한다
+ 문자열에서 특정 문자를 특정 문자로 대체하고자 하는 경우 replace 메서드를 사용한다


# 02월 04일

## 자바
### 잘된점
+ 영화 얘매 콘솔 프로그램 파일을 통해 영화 등록하는 기능 추가
+ 영화 얘매 콘솔 프로그램 파일을 통해 영화 삭제하는 기능 추가
+ [영화 얘매 콘솔 프로그램 작업 내용 정리]()

### 배운점
+ BufferedReader 객체를 사용하여 파일에서 데이터를 한줄씩 읽어온다
+ 한줄에서 ,(콤마)를 기준으로 split 메서드를 사용하여 문자열을 분리하여 배열에 담았다

## 자바 알고리즘
### 잘된점
+ 배열관련 알고리즘 3문제 풀고 정리

### 배운점
+ [보이는 학생 묹제 풀이과정](https://unique-wandflower-4cc.notion.site/2-b97baae12878433498ab200cffc17df1)
+ [가위 바위보 문제 풀이과정](https://unique-wandflower-4cc.notion.site/3-5178387af23d4209b0e860ac382943d6)
+ [피보나치 수열 문제 풀이과정](https://unique-wandflower-4cc.notion.site/4-7240dd4f6d284e60a8952ed9a31c4ff4)



# 02월 05일
## 자바 알고리즘
### 잘된점
+ 배열관련 알고리즘 1문제 풀고 정리

### 배운점
+ 소수를 판단하기 위해 배수가 되는 숫자를 먼저 걸러낸다
+ [소수 찾기_에라토스테니스의 체 방식](https://unique-wandflower-4cc.notion.site/5-5f198572f1774ec1961e0dd021495793)

# 02월 07일
## 자바 영와 얘매 프로그램
### 잘된점
+ 영화 얘매 확인 기능
+ 영화 얘매 취소 기능

### 배운점
+ [영화 얘매 프로그램 얘매 확인 및 얘매 취소 정리 내용](https://unique-wandflower-4cc.notion.site/ch14-a50c66672f624eb2bc5f37b3cb4ff6f3)



# 02월 08일
## 자바 영화 얘매 콘솔 프로그램

### 잘된점
+ 영화 얘매 기능 구현

### 배운점
+ [영와 얘매 기능 구현 및 정리](https://unique-wandflower-4cc.notion.site/ch14-a50c66672f624eb2bc5f37b3cb4ff6f3)

## 자바 알고리즘
### 잘된점
+ 배열관련 알고리즘 2문제 풀고 정리

### 배운점
+ [뒤집은 소수 문제 풀고 정리](https://unique-wandflower-4cc.notion.site/6-68b7d17ac94d4790a1ed31f5c4ae8755)
+ [점수계산 문제 풀고 정리](https://unique-wandflower-4cc.notion.site/7-436dec9bd2064ef58a192f1a5f8c7fdd)