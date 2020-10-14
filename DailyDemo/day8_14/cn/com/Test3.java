package cn.com;

import java.lang.reflect.Method;

//������������
public class Test3 {

    //��ͨ��ʽ����
    public static void test01(){
        User user = new User();
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("��ͨ����ִ��10�ڴ�:"+(endTime-startTime)+"ms");
    }

    //���䷽ʽ����
    public static void test02() throws Exception {
        User user = new User();
        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName", null);

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("���䷽��ִ��10�ڴ�:"+(endTime-startTime)+"ms");

    }

    //���䷽ʽ����,�رռ��
    public static void test03() throws Exception {
        User user = new User();
        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("�رռ����䷽��ִ��10�ڴ�:"+(endTime-startTime)+"ms");

    }

    public static void main(String[] args) throws Exception {
        test01();
        test02();
        test03();
    }

}
