package challenges.HashTable;

public class Entry<K, V> {
    K key;
    V value;
    final int hashCode;

    // Reference to next node
    Entry<K, V> next;

    // Constructor
    public Entry(K key, V value, int hashCode)
    {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}
