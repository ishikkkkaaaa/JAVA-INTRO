public class fifth {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i1 = 10;
        // int to Integer
        Integer i2 = new Integer(i1);
        System.out.println(i2.getClass());
        // Integer to String
        String s1 = Integer.toString(i2);
        System.out.println(s1.getClass());
        // String to int
        String s2 = "1234";
        int i3 = Integer.parseInt(s2);
        System.out.println(i3 + 1);
        // int to String
        String s3 = String.valueOf(i1);
        System.out.println(s3 + 1);
        // String to Integer
        Integer i4 = Integer.parseInt(s2);
        System.out.println(i4.getClass());
        // Integer to int
        Integer i5 = 20;
        int i6 = i5.intValue();
        System.out.println(i6);
    }

}