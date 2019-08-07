package com.company.Lec14;

public class StackClient {
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
//        catch (ArrayIndexOutOfBoundsException e){     //Pop is throwing is a bigger exception
//            System.out.println(e.getMessage());
//        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        finally {
            System.out.println("Hello");
//        }

    }
}
