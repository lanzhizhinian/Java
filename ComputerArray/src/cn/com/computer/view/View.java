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
		
		System.out.println("请输入电脑数量：");
		int num = sc.nextInt();
		while(validateNum.validateInputNum(num)) {
			System.out.println("输入有误，请重新输入...");
			num = sc.nextInt();
		}
		
		computerDao.setComputerArray(num);
		Computer[] computerArray = computerDao.getComputerArray();
		Computer computer = null;
		
		for(int i = 0;i < computerArray.length;i++) {
			System.out.println("请输入第  " +(i+1)+" 台电脑的信息：");
			
			System.out.println("品牌：");
			String brand = sc.next();
			System.out.println("系列：");
			String series = sc.next();
			
			System.out.println("序列号：");
			String serialNum = sc.next();
			if(computerDao.validateSerialNumber(serialNum)) {
				System.out.println("序列号重复，请重新输入： ");
				i--;
				continue;
			}
			
			System.out.println("重量：");
			float weight = sc.nextFloat();
			if(service.validateWeight(weight)) {
				System.out.println("重量输入不合理，请重新输入...");
				i--;
				continue;
			}
			
			computer = new Computer();
			computer.setBrand(brand);
			computer.setSeries(series);
			computer.setSerialNumber(serialNum);
			computer.setWeight(weight);
			
			if(computerDao.addComputerArray(computer)) {
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
			}
		}

		printComputerArray(computerArray);
		
	}

	private void printComputerArray(Computer[] computerArray) {
		// TODO Auto-generated method stub
		System.out.println("品牌\t系列\t序列号\t重量\t");
		for(int i = 0;i < computerArray.length;i++) {
			System.out.println(computerArray[i].getBrand()+"\t"+computerArray[i].getSeries()+"\t"+
					computerArray[i].getSerialNumber()+"\t"+computerArray[i].getWeight());
		}
	}
}
