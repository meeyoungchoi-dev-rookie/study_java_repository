package ch10;

public class Truck extends  Car {

    double payload;

    Truck(String _name , double _payload) {
        super(_name);
        payload = _payload;
        System.out.println("적재량: " + payload);
    }
    
    void load() {
        System.out.println(name + "가 " + payload  +"kg 만큼 물건을 적재한다");
    }




}
