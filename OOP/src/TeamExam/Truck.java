package TeamExam;

class Truck implements DeliveryService {
    private int capacity;

    public Truck(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int MinimumMove(int[] deliveries, int[] pickups) {
        int n = deliveries.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            int deliveryCount = deliveries[i - 1];
            int pickupCount = pickups[i - 1];

            for (int j = 0; j <= capacity; j++) {
                dp[i][j] = dp[i - 1][j] + deliveryCount; // 집으로 이동하는 경우 (배달만)
                if (j >= deliveryCount) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - deliveryCount] + pickupCount); // 집에서 픽업 후 이동하는 경우 (배달+픽업)
                }
            }
        }

        int minDistance = Integer.MAX_VALUE;
        for (int j = 0; j <= capacity; j++) {
            minDistance = Math.min(minDistance, dp[n][j]);
        }

        return minDistance;
    }
}