package cn.com;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

	public static void main(String[] args) {									
		//	�ռ��˵�������						
		String	to	=	"2496350070@qq.com";
		//	�����˵�������						
		String	from	=	"1477069035@qq.com";
		//	ָ�������ʼ�������Ϊ	localhost						
		String	host	=	"localhost";
		//	��ȡϵͳ����						
		Properties	properties	=	System.getProperties();
		//	�����ʼ�������						
		properties.setProperty("mail.smtp.host",host);
		//	��ȡĬ�ϵ�	Session	����						
		Session	session	=	Session.getDefaultInstance(properties);
		try{									
			//	����Ĭ�ϵ�	MimeMessage	����									
			MimeMessage	message	=	new	MimeMessage(session);
			
			//	Set	From:	ͷ��ͷ�ֶ�									
			message.setFrom(new	InternetAddress(from));
			//	Set	To:	ͷ��ͷ�ֶ�									
			message.addRecipient(Message.RecipientType.TO,																																		
			new	InternetAddress(to));
			//	Set	Subject:	ͷ�ֶ�									
			message.setSubject("This	is	the	Subject	Line!");
			//	����	HTML	��Ϣ,	���Բ���html��ǩ									
			message.setContent("<h1>This	is	actual	message</h1>","text/html"	);
			//	������Ϣ									
			Transport.send(message);									
			System.out.println("Sent	message	successfully....");						
		}catch	(MessagingException	mex)	{									
			mex.printStackTrace();						
		}	
	}
}
