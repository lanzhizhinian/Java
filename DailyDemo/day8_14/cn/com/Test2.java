package cn.com;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();//获取系统类的加载器
        System.out.println(systemClassLoader);

        //获取系统加载器的父类加载器-->扩展类加载器

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器-->根加载器(c/c++)

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("cn.com.Test2").getClassLoader();//自定义的类,是系统类加载器加载的
        System.out.println(classLoader);
        //测试JDK内置类是哪个加载器加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();//由于JDK内置的类是引导类加载器,也就是根加载器加载的所以无法获取
        System.out.println(classLoader);

        //图和获得系统加载器可以加载的路径
        String property = System.getProperty("java.class.path");
        System.out.println(property);
    }
}
