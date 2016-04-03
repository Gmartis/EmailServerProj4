/**
 * Created by GraysonMartis on 4/2/16.
 */
public class tester {
    public static void main(String args[]) {
        DynamicBuffer test = new DynamicBuffer(10);
        Email test1 = new Email("Grayson", "Phoebe", 124, "Hi");
        Email test2 = new Email("Grayson", "Phoebe", 124, "Sup");
        Email test3 = new Email("Grayson", "Person", 124, "nothing");
        test.add(test1);
        System.out.println(test.numElements());
        test.remove(0);
        System.out.println(test.numElements());
        test.add(test1);
        test.add(test2);
        test.add(test3);
        Email email1 = (test.getNewest(3))[0];
        Email email2 = (test.getNewest(3))[1];
        Email email3 = (test.getNewest(3))[2];
        System.out.println(email1.toString());
        System.out.println(email2.toString());
        System.out.println(email3.toString());
    }
}
