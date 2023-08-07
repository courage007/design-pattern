package io.github.courage007.design.pattern.behavior.memento;

/**
 * [备忘录模式客户端]
 *
 * @date: 2023-08-06
 */
public class MementoClient {
    public void test() {
        Originator originator = new Originator();
        originator.setName("1");
        originator.setDescribe("one");
        Caretaker caretaker = new Caretaker(originator);
        caretaker.snapshot();
        System.out.println("name is " + originator.getName() + " , " + "describe is " + originator.getDescribe());
        originator.setName("2");
        originator.setDescribe("two");
        caretaker.snapshot();
        System.out.println("name is " + originator.getName() + " , " + "describe is " + originator.getDescribe());
        caretaker.undo();
        System.out.println("name is " + originator.getName() + " , " + "describe is " + originator.getDescribe());
        caretaker.undo();
        System.out.println("name is " + originator.getName() + " , " + "describe is " + originator.getDescribe());
    }
}
