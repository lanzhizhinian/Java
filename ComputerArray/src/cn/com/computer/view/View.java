package cn.com.computer.view;

import java.util.Scanner;

import cn.com.classpackage.Computer;
import cn.com.computer.dao.ComputerDao;
import cn.com.computer.service.Service;
import cn.com.computer.validatenum.ValidateInputNum;
public class View {

	private Scanner sc;
	private Service service;
	private ComputerDao computerDao;
	private ValidateInputNum validateNum;
	
	public View() {
		sc = new Scanner(System.in);
		service = new Service();
		computerDao = new ComputerDao();
		validateNum = new ValidateInputNum();
		
		init();
	}
	
	public void init() {
		
		System.out.println("���������������");
		int num = sc.nextInt();
		while(validateNum.validateInputNum(num)) {
			System.out.println("������������������...");
			num = sc.nextInt();
		}
		
		computerDao.setComputerArray(num);
		Computer[] computerArray = computerDao.getComputerArray();
		Computer computer = null;
		
		for(int i = 0;i < computerArray.length;i++) {
			System.out.println("�������  " +(i+1)+" ̨���Ե���Ϣ��");
			
			System.out.println("Ʒ�ƣ�");
			String brand = sc.next();
			System.out.println("ϵ�У�");
			String series = sc.next();
			
			System.out.println("���кţ�");
			String serialNum = sc.next();
			if(computerDao.validateSerialNumber(serialNum)) {
				System.out.println("���к��ظ������������룺 ");
				i--;
				continue;
			}
			
			System.out.println("������");
			float weight = sc.nextFloat();
			if(service.validateWeight(weight)) {
				System.out.println("�������벻��������������...");
				i--;
				continue;
			}
			
			computer = new Computer();
			computer.setBrand(brand);
			computer.setSeries(series);
			computer.setSerialNumber(serialNum);
			computer.setWeight(weight);
			
			if(computerDao.addComputerArray(computer)) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}
		}

		printComputerArray(computerArray);
		
	}

	private void printComputerArray(Computer[] computerArray) {
		// TODO Auto-generated method stub
		System.out.println("Ʒ��\tϵ��\t���к�\t����\t");
		for(int i = 0;i < computerArray.length;i++) {
			System.out.println(computerArray[i].getBrand()+"\t"+computerArray[i].getSeries()+"\t"+
					computerArray[i].getSerialNumber()+"\t"+computerArray[i].getWeight());
		}
	}
}
