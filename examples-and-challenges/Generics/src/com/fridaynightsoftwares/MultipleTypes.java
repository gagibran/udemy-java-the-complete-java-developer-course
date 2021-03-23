package com.fridaynightsoftwares;

public class MultipleTypes<T extends Number, V> {
    private T objOne;
    private V objTwo;
    public MultipleTypes(T objOne, V objTwo) {
        this.objOne = objOne;
        this.objTwo = objTwo;
        System.out.println(objOne.getClass().getName());
        System.out.println(objTwo.getClass().getName());
    }

    public T getObjOne() {
        return objOne;
    }

    public void multiply(MultipleTypes<?, V> multipleTypes) {
        System.out.println(multipleTypes.getObjOne().intValue() * this.objOne.intValue());
    }
}
