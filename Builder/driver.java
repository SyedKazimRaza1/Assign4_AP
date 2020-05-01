package Builder;
/*
Builder pattern aims to Separate the construction of a complex object from its representation
so that the same construction process can create different representations.
In this example , we are making tea by using builder design pattern.
We used to construct a complex object step by step and the final step will return the object.
 */
public class driver {
    public static void main(String[] args)
    {
        Tea tea= new Tea.TeaBuilder("Elachi").milk(true).sugar(true).size("Medium").build();
        System.out.println(tea);



    }

}
