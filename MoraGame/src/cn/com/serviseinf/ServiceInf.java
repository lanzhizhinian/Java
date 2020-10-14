package cn.com.serviseinf;

public interface ServiceInf {
	
	int WIN = 1;
	int EQ = 0;
	int LOSE = -1;

	/**
	 * 判断谁赢
	 * @param num1 - 电脑出的
	 * @param num2 - 玩家出的
	 * @void
	 */
	void judge(int num1, int num2);

	/**
	 * 判断输入是否合理
	 * @param num-用户输入的数字
	 * @return -1-输入不合法，重新输入 0-游戏结束 1-输入合法
	 */
	int validateByInput(int num);

	void transition(String identity, int num);

	/**
	 *  为了让用户随心所欲地输入，不用忍受异常抛出导致程序结束
	 * @param input-用户输入的字符串
	 * @return
	 */
	int transFormat(String input);
	
	/**
	 * 获取0 - num-1范围内的随机数
	 * @param num
	 * @return
	 */
	int getRandom(int num);

}