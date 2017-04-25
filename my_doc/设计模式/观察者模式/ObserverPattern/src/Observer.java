/**
 * 观察者接口
 * @author Xin
 *
 */
public interface Observer {
	
	//观察者被通知价格发生更新
	public void update(float price);
}
