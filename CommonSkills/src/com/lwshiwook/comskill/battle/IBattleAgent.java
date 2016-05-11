package com.lwshiwook.comskill.battle;

import java.util.ArrayList;
import java.util.List;
import com.lwshiwook.comskill.effect.IEffect;

/**
 * 职能  关键帧发消息 选择目标 战场信息
 * @author Wayne
 *
 */
public abstract class IBattleAgent {

	public abstract List<IGameUnit> findEffected(long effectUid);
	
	public abstract List<IGameUnit> aimTarget(IEffect effect);
	
	public abstract void sendAtkPack(IAtkPack pack);

	protected List<IAtkPack> packQ = new ArrayList<>();
	
	/**
	 * 更新方法
	 */
	public void updateImpulse(){
		long nowTime = System.currentTimeMillis();
		packQ.forEach(c -> {
			if(c.engage(nowTime)){
				sendAtkPack(c);
			}
		});
	}

	public synchronized void addPack(Damage damage) {
		
	}
	
	

}
