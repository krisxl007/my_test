
public class TestObserver {

	public static void main(String[] args) {
		//设置被观察主题娃娃的初始化价格为9999
		Doll doll = new Doll(9999);
		System.out.println("娃娃的原价为: " + doll.getPrice());
		
		//设置具体观察者的名字
		Person p1 = new Person("小黑");
		Person p2 = new Person("小白");
		
		//注册两个观察者
		doll.registerObserver(p1);
		doll.registerObserver(p2);
		
		//第一轮降价为8888
		doll.setPrice(8888);
		
		//第二轮降价为7777
		doll.setPrice(7777);
		doll.removeObserver(p1); //小黑购买了娃娃，并取消观察
		
		//第三轮降价为6666
		doll.setPrice(6666);
	}

}
