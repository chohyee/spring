package cn.wells.f_junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wells.domain.Person;

/*
 * ��ע�����ò�����������junit����
 */
@RunWith(SpringJUnit4ClassRunner.class)//�����Ǵ�������
@ContextConfiguration("classpath:applicationContext.xml")//ָ����������ʱʹ���ĸ������ļ�
public class Demo {
	
	@Resource(name="person")
	private Person p;
	@Test
	public void test(){
		//����Զ��������ٷ�������Ϊ��������������ٸö���p
		System.out.println(p);
	}
}
