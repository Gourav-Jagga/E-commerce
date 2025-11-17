package com.gjdev.platform.utility;

import java.util.function.BiConsumer;

public class Builder<T> {
    private final T instance;

    private Builder(Class<T> clazz) {
        if (!clazz.isAnnotationPresent(Buildiable.class)) {
            throw new IllegalArgumentException(
                    "Class " + clazz.getName() + " must be annotated with @Buildable to use Builder"
            );
        }
        try {
            this.instance = clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Builder<T> of(Class<T> clazz) {
        return new Builder<>(clazz);
    }

    public <V> Builder<T> with(BiConsumer<T, V> setter, V value) {
        setter.accept(instance, value);
        return this;
    }

    public T build() {
        return instance;
    }
}
