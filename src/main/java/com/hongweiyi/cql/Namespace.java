package com.hongweiyi.cql;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Namespace implements Map<String, Object> {
    private Map<String, Object> base;
    private Map<String, Object> current;

    public Namespace(Map<String, Object> base) {
        this(base, new HashMap<String, Object>());
    }

    public Namespace(Map<String, Object> base, Map<String, Object> current) {
        this.base = base;
        this.current = current;
    }

    public void setCurrent(Map<String, Object> current) {
        this.current = current;
    }

    public void clear() {
        current.clear();
    }

    public boolean containsKey(Object key) {
        return (current.containsKey(key) || base.containsKey(key));
    }

    public boolean containsValue(Object value) {
        return current.containsValue(value);
    }

    public Set<java.util.Map.Entry<String, Object>> entrySet() {
        return current.entrySet();
    }

    public Object get(Object key) {
        if (current.containsKey(key)) {
            return current.get(key);
        } else {
            return base.get(key);
        }
    }

    public boolean isEmpty() {
        return current.isEmpty();
    }

    public Set<String> keySet() {
        return current.keySet();
    }

    public Object put(String key, Object value) {
        return current.put(key, value);
    }

    public void putAll(Map<? extends String, ? extends Object> m) {
        current.putAll(m);
    }

    public Object remove(Object key) {
        return current.remove(key);
    }

    public int size() {
        return current.size();
    }

    public Collection<Object> values() {
        return current.values();
    }
}
