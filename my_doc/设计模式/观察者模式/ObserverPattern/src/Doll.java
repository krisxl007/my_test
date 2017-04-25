import java.util.Vector;

/**
 * 被观察主题的实例(concrete subject)
 * @author Xin
 *
 */
public class Doll implements Subject {
	
	private float price;
	
	//被观察的主题拥有一个所有观察自己的对象的列表
	private Vector<Observer> vector = new Vector<Observer>();
	
	public Doll(float price) {
		this.price = price;
	}

	@Override
	public void registerObserver(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyService() {
		for(Observer observer : vector) {
			observer.update(price);
		}
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		notifyService();
	}
}
