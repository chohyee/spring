package cn.wells.h_annotationaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


//֪ͨ��
@Aspect
public class MyAdvice {
//ǰ��֪ͨ	
//	|-Ŀ�귽������֮ǰ����
//����֪ͨ(��������쳣�������)
//	|-��Ŀ�귽������֮�����
//����֪ͨ
//	|-��Ŀ�귽��֮ǰ��֮�󶼵���
//�쳣����֪ͨ
//	|-��������쳣,�ͻ����
//����֪ͨ(�����Ƿ���� �쳣�������)
//	|-��Ŀ�귽������֮�����
//----------------------------------------------------------------
	@Pointcut("execution(* cn.wells.h_annotationaop.*ServiceIImpl.*(..))")
	public void pc(){}//ָ��������idΪpc
	
	//ǰ��֪ͨ
		@Before("MyAdvice.pc()")//ָ���÷�����ǰ��֪ͨ,���ƶ������
		public void before(){
			System.out.println("����ǰ��֪ͨ!!");
		}
		//����֪ͨ
		//@AfterReturning("execution(* cn.wells.h_anotatiionaop.*ServiceIImpl.*(..))")
		@AfterReturning("MyAdvice.pc()")
		public void afterReturning(){
			System.out.println("���Ǻ���֪ͨ(��������쳣�������)!!");
		}
		//����֪ͨ(ע�⴫��)ProceedingJoinPointִ�����ӵ�,aspect���е�
		//����֪ͨ
		@Around("execution(* cn.wells.h_annotationaop.*ServiceImpl.*(..))")
		public Object around(ProceedingJoinPoint pjp) throws Throwable {
			System.out.println("���ǻ���֪֮ͨǰ�Ĳ���!!");
			Object proceed = pjp.proceed();//����Ŀ�귽��
			System.out.println("���ǻ���֪֮ͨ��Ĳ���!!");
			return proceed;
		}
		//�쳣֪ͨ
		@AfterThrowing("execution(* cn.wells.h_annotationaop.*ServiceImpl.*(..))")
		public void afterException(){
			System.out.println("������!�����쳣��!!");
		}
		//����֪ͨ
		@After("execution(* cn.wells.h_annotationaop.*ServiceImpl.*(..))")
		public void after(){
			System.out.println("���Ǻ���֪ͨ(�����쳣Ҳ�����)!!");
		}
}
