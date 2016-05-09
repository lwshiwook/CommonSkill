package com.lwshiwook.comskill.battle;

import java.util.List;

/**
 * 职能  关键帧发消息 选择目标 战场信息
 * @author Wayne
 *
 */
public abstract class IBattleAgent implements Runnable {

	public abstract List<IGameUnit> findEffected(long effectUid);
	
	public abstract List<IGameUnit> aimTarget();

	@Override
	public void run() {
		
		
	}
	
	

}
