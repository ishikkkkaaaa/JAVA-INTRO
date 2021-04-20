public class sixth {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        float f1 = 10.02f;
        // float to Float
        Float f2 = new Float(f1);
        System.out.println(f2.getClass());
        // Float to String
        String s1 = Float.toString(f2);
        System.out.println(s1.getClass());
        // String to float
        String s2 = "12.34";
        float f3 = Float.parseFloat(s2);
        System.out.println(f3 + 1);
        // float to String
        String s3 = String.valueOf(f1);
        System.out.println(s3 + 1);
        // String to Float
        Float f4 = Float.parseFloat(s2);
        System.out.println(f4.getClass());
        // Float to float
        Float f5 = 20.02f;
        float f6 = f5.floatValue();
        System.out.println(f6);
    }

}