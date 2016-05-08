package com.lwshiwook.comskill.effect;

import java.util.List;
import org.gof.demo.battlesrv.stageObj.UnitObject;

public abstract class IEffect {
	
	public void doEffectToTarget(IBattleAgent ba) {
		List<UnitObject> targets = aimTarget(ba);
		targets.forEach(c -> doEffect(c));
	}

	public void recoverEffect(IBattleAgent ba){
		long effectUid = getUid();
		List<UnitObject> effected = ba.findEffected(effectUid);
		effected.forEach(c -> recover(c));
	}

	abstract List<UnitObject> aimTarget(IBattleAgent ba);

	abstract void doEffect(UnitObject target);
	
	abstract void recover(UnitObject target);
	
	abstract long getUid();

}
