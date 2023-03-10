package com.kbstar.frame;

import java.util.List;


/**	(/** +enter치면 나옴)
 * 23.3.10
 * @author youngeunk
 *
 * @param <V1> UserDTO
 * @param <V2> AccountDTO
 * @param <V3> TransactionDTO
 * @param <K> String id
 * @param <P> Stirng pwd
 */

public interface BankService<V1, V2, V3, K, P> {
	public void register(V1 v) throws Exception;
	public V1 login(K k, P p) throws Exception;
	public V1 getUserInfo(K k) throws Exception;
	public void makeAccount(K k, double balance) throws Exception; //사용자ID와 Bal만 넣어주면 자동 계좌개설
	public List<V2> getAllAccount(K k) throws Exception;
	public List<V3> getAllTr(String acc) throws Exception;
	public void transaction(String sendAcc,
			String receiveAcc, double balance, String desc) throws Exception;
}
