package gupao.designPatterns.d_Proxy.service;

public class Son implements I_Person {
	@Override
	public void findLover() {
		System.out.println("被代理人： 相亲  吃饭  逛街  多约几次   感情增进 ......");
	}
}
