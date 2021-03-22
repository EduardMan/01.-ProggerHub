package tech.itpark.proggerhub.di;

import java.util.*;

// 1. Регистрация
// 2. Связывание зависимостей
public class Container {
    /**
     * "Определения зависимостей"
     */
    private final Set<Class> definitions = new HashSet<>();
    /**
     * Живые зависимости
     */
    private final Map<Class, Object> objects = new HashMap<>();

    public void register(Class... clz) {
        definitions.addAll(Arrays.asList(clz));
    }

    public void wire() {
        // definition -> object (map)
        // TODO: 1. Reflection API
        // TODO: 2. Проблема графа
    }
}
