package bufferex;

import java.nio.ByteBuffer;

public class ByteBufferEx {

    public static void main(String[] args) {
        // 바이트 버퍼 생성하는 방법1.
        // Capacity가 10인 버퍼 생성
        // 인덱스 0 부터 9까지 갖는 Byte 타입의 배열이 만들어진다
        ByteBuffer b = ByteBuffer.allocate(100);

        // 바이트 버퍼 생성하는 방법2.
        // wrap 메서드를 사용해서 byte 배열을 감싸서 Buffer 객체 생성
        byte[] byteArr = new byte[]{1, 2, 3, 4};
        ByteBuffer buffer = ByteBuffer.wrap(byteArr);
        System.out.println(buffer.get());
    }
}
