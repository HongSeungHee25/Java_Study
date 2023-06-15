package TeamExam1;

class House {
    private int deliveryCount;
    private int pickupCount;

    public House(int deliveryCount, int pickupCount) {
        this.deliveryCount = deliveryCount;
        this.pickupCount = pickupCount;
    }

    public int getDeliveryCount() {
        return deliveryCount;
    }

    public int getPickupCount() {
        return pickupCount;
    }
}