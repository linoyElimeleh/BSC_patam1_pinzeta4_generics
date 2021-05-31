package test;

import java.util.HashMap;
import java.util.Map;

public class GenericFactory<V> {

    private interface Creator<V> {
        public V create(); // no unhandled exceptions
    }

    Map<String, Creator<V>> map;

    public GenericFactory() {
        map = new HashMap<>();
    }

    public void insertProduct(String key, Class<? extends V> c) {
        Creator<V> creator = () -> {
            try {
                return c.newInstance();
            } catch (Exception e) {
                return null;
            }
        };
        map.put(key, creator);
    }

    public V getNewProduct(String key) {
        if (map.containsKey(key))
            return map.get(key).create();
        return null;
    }
}
