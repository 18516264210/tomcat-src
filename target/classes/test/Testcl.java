package test;

public class Testcl {

    public static void main(String[] args) {
        Testcl t = new Testcl();
        try {
            Class<?> clazz = t.getClass().getClassLoader().loadClass("test.TestClassLoader");
            Object o = clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
