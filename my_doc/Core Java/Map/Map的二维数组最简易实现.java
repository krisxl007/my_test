package test;

public class CustomMap {
	
	private Object[][] pairs;
	private int index;
	
	public CustomMap(int length) {
		pairs = new Object[length][2];
	}
	
	public void put(Object key, Object value) {
		if(index >= pairs.length)
			throw new ArrayIndexOutOfBoundsException();
		pairs[index++] = new Object[] {key, value};
	}
	
	public Object get(Object key) {
		for(int i = 0; i < index; i++) {
			if(key.equals(pairs[i][0]))
				return pairs[i][1];
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < index; i++) {
			result.append(pairs[i][0].toString());
			result.append(" : ");
			result.append(pairs[i][1].toString());
			if(i < index - 1)
				result.append("\n");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		CustomMap map = new CustomMap(3);
		map.put("One", 1);
		map.put("Two", 2.000f);
		map.put("Three", "3");
		System.out.println(map);
	}
}
