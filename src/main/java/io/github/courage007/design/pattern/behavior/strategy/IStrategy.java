package io.github.courage007.design.pattern.behavior.strategy;

/**
 * [抽象策略类]
 *
 * @date: 2023-07-02
 */
public interface IStrategy {
    /**
     * 执行操作
     *
     * @param paramStr 参数字符串
     */
    void operation(String paramStr);
}
