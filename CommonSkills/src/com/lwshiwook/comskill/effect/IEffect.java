package com.lwshiwook.comskill.effect;

import java.util.List;

import com.lwshiwook.comskill.battle.IBattleAgent;
import com.lwshiwook.comskill.battle.IGameUnit;

public abstract class IEffect {
	
	public void doEffectToTarget(IBattleAgent ba) {
		ba.aimTarget().forEach(c -> doEffect(c));
	}

	public void recoverEffect(IBattleAgent ba){
		long effectUid = getUid();
		List<IGameUnit> effected = ba.findEffected(effectUid);
		effected.forEach(c -> recover(c));
	}

	protected abstract void doEffect(IGameUnit target);
	
	protected abstract void recover(IGameUnit target);
	
	protected abstract long getUid();
	
	public abstract int getPriority();

}
