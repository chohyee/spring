package cn.wells.h_annotationaop;

/*
 * Spring aop实现的动态代理的*目标对象*
 */
public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		System.out.println("save方法");
	}
	@Override
	public void delete() {
		System.out.println("delete方法");
	}

	@Override
	public void update() {
		System.out.println("update方法");
	}

	@Override
	public void find() {
		System.out.println("find方法");
	}

}
