public class InnerClassDemo {
    public static void execute(String[] args)
    {
// inner class
        class CheckableOblong extends Oblong implements Checkable
        {
            public CheckableOblong(double lengthIn, double heightIn)
            {
                super(lengthIn, heightIn);
            }
            @Override
            public boolean check()
            {
                return getLength() > 0 && getHeight() > 0;
            }
        }

        Oblong testOblong = new Oblong (8,8);
        Checkable oblong1 = new CheckableOblong(5, 0); //invalid
        Checkable oblong2 = new CheckableOblong(5, 6); // valid
        System.out.println("oblong1 is " + checkValidity(
                new Checkable() {
                    @Override
                    public boolean check() {
                        return testOblong.getLength() != testOblong.getHeight();
                    }
                }
        ));

        System.out.println("oblong is " + checkValidity(() ->  testOblong.getLength() > 0 && testOblong.getHeight() > 0));

        System.out.println("oblong2 is " + checkValidity(
                new CheckableOblong(5, 6)
        ));
    }
    private static String checkValidity(Checkable objectIn)
    {
        if(objectIn.check())
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }
}
