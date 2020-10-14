package cn.com.officeclerk;

public class OfficeClerkTest {

	public static void main(String[] args) {
		Programmer programmer = new Programmer("Ð¡Ã÷","j001",7999.5F);
		programmer.showProgrammer();
		
		System.out.println();
		
		ProjectManager pm = new ProjectManager("Ð¡ºì","s001",15999.3F,7600F);
		pm.showProjectMenager();
	}
	
}
