package cn.wells.d_listenerAboutContext;

import javax.servlet.ServletContext;

import org.junit.Test;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 本示例就是将容器的建立与ServletContext绑定，同生死,千万不要在每个用到容器的地方新建一个容器
 * 需要导入spring-web-4.2.4.RELEASE.jar包,并在web.xml中配置（监听）容器与项目一起启动
 * @author clover
 *
 */
public class Demo {
	@Test
	public void test(){
		//先获取ServletContext，然后从其中获取容器ac
		//ServletContext sc = ServletActionContext.getServletContext();//struts2里面的，其他框架又不同
		//WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
	}
}
