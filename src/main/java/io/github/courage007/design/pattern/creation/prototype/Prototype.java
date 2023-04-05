package io.github.courage007.design.pattern.creation.prototype;

/**
 * [原型接口]
 *
 * @date: 2023-03-20
 */
public interface Prototype {
    /**
     * 复制对象
     *
     * @return 复制后的对象
     */
    Prototype clone();
}
