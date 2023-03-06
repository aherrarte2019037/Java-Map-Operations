package com.map_operations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory<E, T> {

    /**
     * @param implementation
     * @return IStack<E>
     */
    public Map<E, T> getMap(MapImplementation implementation) {
        if (implementation == MapImplementation.HashMap) {
            return new HashMap<E, T>();
        }

        if (implementation == MapImplementation.TreeMap) {
            return new TreeMap<E, T>();
        }

        if (implementation == MapImplementation.LinkedHashMap) {
            return new LinkedHashMap<E, T>();
        }

        return null;
    }
}
