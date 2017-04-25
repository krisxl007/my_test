/**
 * 被观察的主题的接口
 * @author Xin
 *
 */
public interface Subject {
	
	//注册观察者
	public void registerObserver(Observer observer);
	
	//移除观察者
	public void removeObserver(Observer observer);
	
	//当主题对象发生变化时通知所有观察者
	public void notifyService();
}
