package neo.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        MemoryCard card = new MemoryCard();
        USB adapter = new CardReader(card);
        Computer pc = new Computer();
        pc.readFromDevice(adapter);
    }
}
