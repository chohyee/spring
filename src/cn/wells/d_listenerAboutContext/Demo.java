package cn.wells.d_listenerAboutContext;

import javax.servlet.ServletContext;

import org.junit.Test;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * ��ʾ�����ǽ������Ľ�����ServletContext�󶨣�ͬ����,ǧ��Ҫ��ÿ���õ������ĵط��½�һ������
 * ��Ҫ����spring-web-4.2.4.RELEASE.jar��,����web.xml�����ã���������������Ŀһ������
 * @author clover
 *
 */
public class Demo {
	@Test
	public void test(){
		//�Ȼ�ȡServletContext��Ȼ������л�ȡ����ac
		//ServletContext sc = ServletActionContext.getServletContext();//struts2����ģ���������ֲ�ͬ
		//WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
	}
}
