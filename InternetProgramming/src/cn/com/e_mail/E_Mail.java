//��Ҫ�û��������ʼ�����ʵ��
//�ļ��� SendEmail2.java
//��ʵ����QQ����Ϊ��������Ҫ��qq��̨����
package cn.com.e_mail;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class E_Mail {
	public static void main(String args[]) {
		// �ռ��˵�������
		String to = "1929786221@qq.com";

		// �����˵�������
		String from = "1477069035@qq.com";

		// ָ�������ʼ�������Ϊ smtp.qq.com
		String host = "smtp.qq.com"; // QQ �ʼ�������

		// ��ȡϵͳ����
		Properties properties = System.getProperties();

		// �����ʼ�������
		properties.setProperty("mail.smtp.host", host);

		properties.put("mail.smtp.auth", "true");
		// ��ȡĬ��session����
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("1477069035@qq.com", "oehigbmyzqvziegi"); // �������ʼ��û�������Ȩ��
			}
		});

		try {
			// ����Ĭ�ϵ� MimeMessage ����
			MimeMessage message = new MimeMessage(session);

			// Set From: ͷ��ͷ�ֶ�
			message.setFrom(new InternetAddress(from));

			// Set To: ͷ��ͷ�ֶ�
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: ͷ��ͷ�ֶ�
			message.setSubject("This is the Subject Line!");

			// ������Ϣ��
			message.setText("This is actual message");

			// ������Ϣ
			Transport.send(message);
			System.out.println("Sent message successfully....from runoob.com");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}