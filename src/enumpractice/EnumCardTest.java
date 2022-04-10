package enumpractice;

public class EnumCardTest {
    public static void main(String[] args) {
        if (Card.CLOVER == Card.TWO) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
        // 에러가 발생한다
        // 왜?
        // enum을 사용하여 값을 정의한 경우 값을 비교하기 전에 타입을 먼저 비교하기 때문이다ㅏ
        // 값이 같더라도 타입이 다르면 에러가 발생한다
//        if (EnumCard.Kind.CLOVER == EnumCard.Value.TWO) {
//
//        }

        // values 메서드를 사용하여 Kind 열거형에 저장된 모든 상수를 출력할 수 있다
        EnumCard.Kind[] kinds = EnumCard.Kind.values();

        for (EnumCard.Kind d  : kinds) {
            System.out.println(d);
        }

        EnumCard.Value[] values = EnumCard.Value.values();

        for (EnumCard.Value value : values) {
            System.out.println(value);
        }

    }
}
