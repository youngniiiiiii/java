package co.kbstar.frame;

public interface Service<K,V> {
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
}
