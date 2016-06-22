package com.lwshiwook.comskill.effect.implement;

import java.util.List;

import com.lwshiwook.comskill.battle.IGameUnit;
import com.lwshiwook.comskill.battle.pack.Damage;
import com.lwshiwook.comskill.effect.IEffect;

public class DamageEffect implements IEffect {
	
	private Damage damage;

	public Damage getDamage() {
		return damage;
	}

	public void setDamage(Damage damage) {
		this.damage = damage;
	}

	@Override
	public void doEffect(List<IGameUnit> targets) {
		targets.forEach(c -> c.beingHit(damage));
		
	}

	@Override
	public void recover(List<IGameUnit> targets) {
		// do nothing
	}

	@Override
	public long getUid() {
		return 0;
	}

	@Override
	public int getPriority() {
		return 0;
	}


	


}
