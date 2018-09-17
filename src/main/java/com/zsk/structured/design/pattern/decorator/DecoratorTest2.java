package com.zsk.structured.design.pattern.decorator;


abstract class AbstractDecorator implements Showable {

    protected Showable showable;

    public AbstractDecorator(Showable showable) {
        this.showable = showable;
    }
    public void show() {
        showable.show();//直接调用不做加任何粉饰。
    }
}
 class FoundationMakeup extends AbstractDecorator{

    public FoundationMakeup(Showable showable) {
        super(showable);//调用化妆品父类注入
    }

    @Override
    public void show() {
        System.out.print("打粉底(");
        showable.show();
        System.out.print(")");
    }
}

class Lipstick extends AbstractDecorator{

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红(");
        showable.show();
        System.out.print(")");
    }
}
public class DecoratorTest2 {
    public static void main(String[] args) {
        //口红包裹粉底，再包裹女友。
        Showable madeupGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeupGirl.show();
        //运行结果：涂口红(打粉底(女孩的脸庞))
    }
}

