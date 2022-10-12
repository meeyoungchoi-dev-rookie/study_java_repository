package genericex2;

// FruitBox 매개변수 T에 올수 있는 타입은 Fruit 과 Eatable을 상속받는 클래스면 누구나 가능
// FruitBox 매개변수 T 클래스가 Box 매개변수 T 클래스를 상속받는다
public class FruitBox<T extends  Fruit & Eatable> extends Box<T> {
}
