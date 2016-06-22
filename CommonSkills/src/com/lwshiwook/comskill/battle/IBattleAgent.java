package com.lwshiwook.comskill.battle;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.lwshiwook.comskill.battle.pack.Damage;
import com.lwshiwook.comskill.battle.pack.IAtkPack;

/**
 * 职能 关键帧发消息 战场信息
 * 
 * @author Wayne
 *
 */
public abstract class IBattleAgent {

	protected IGameUnit unit;

	public abstract void sendAtkPack(IGameUnit unit, IAtkPack pack);

	protected ConcurrentLinkedQueue<IAtkPack> packQ = new ConcurrentLinkedQueue<>();

	/**
	 * 更新方法
	 */
	public void updateImpulse() {
		IAtkPack pack = null;
		while( null!=(pack = packQ.poll())){
			sendAtkPack(unit, pack);
		}
	}

	public void addPack(Damage damage) {
		packQ.add(damage);
	}

}
