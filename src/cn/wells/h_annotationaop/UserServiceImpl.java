package cn.wells.h_annotationaop;

/*
 * Spring aopʵ�ֵĶ�̬�����*Ŀ�����*
 */
public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		System.out.println("save����");
	}
	@Override
	public void delete() {
		System.out.println("delete����");
	}

	@Override
	public void update() {
		System.out.println("update����");
	}

	@Override
	public void find() {
		System.out.println("find����");
	}

}
