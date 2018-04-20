package LfuCaching;

public class Main {
    public static void main(String[] args) {
        LfuCaching cache = new LfuCaching(2);
        cache.set(1, 1);    // Set Value 1
        cache.set(2, 2);    // Set Value 2
        cache.get(1);       // Returns 1
        cache.set(3, 3);    // Evicts Key 2
        cache.get(2);       // Returns -1
        cache.get(3);       // Returns 3.
        cache.set(4, 4);    // Evicts Key 1.
        cache.get(1);       // Returns -1
        cache.get(3);       // Returns 3
        cache.get(4);       // Returns 4
    }
}
