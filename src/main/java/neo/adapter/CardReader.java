package neo.adapter;

class CardReader implements USB {
    private MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    public void connectWithUsb() {
        memoryCard.readData();
    }
}
