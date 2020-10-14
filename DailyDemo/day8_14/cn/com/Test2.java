package cn.com;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();//��ȡϵͳ��ļ�����
        System.out.println(systemClassLoader);

        //��ȡϵͳ�������ĸ��������-->��չ�������

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //��ȡ��չ��������ĸ��������-->��������(c/c++)

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //���Ե�ǰ�����ĸ����������ص�
        ClassLoader classLoader = Class.forName("cn.com.Test2").getClassLoader();//�Զ������,��ϵͳ����������ص�
        System.out.println(classLoader);
        //����JDK���������ĸ����������ص�
        classLoader = Class.forName("java.lang.Object").getClassLoader();//����JDK���õ����������������,Ҳ���Ǹ����������ص������޷���ȡ
        System.out.println(classLoader);

        //ͼ�ͻ��ϵͳ���������Լ��ص�·��
        String property = System.getProperty("java.class.path");
        System.out.println(property);
    }
}
