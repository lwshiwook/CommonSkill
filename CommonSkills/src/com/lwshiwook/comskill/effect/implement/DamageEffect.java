package com.lwshiwook.comskill.effect.implement;

import com.lwshiwook.comskill.battle.Damage;
import com.lwshiwook.comskill.battle.IGameUnit;
import com.lwshiwook.comskill.effect.IEffect;

public class DamageEffect extends IEffect {
	
	private Damage damage;

	public Damage getDamage() {
		return damage;
	}

	public void setDamage(Damage damage) {
		this.damage = damage;
	}

	@Override
	protected void doEffect(IGameUnit target) {
		target.beingHit(damage);
	}

	@Override
	protected void recover(IGameUnit target) {
		//do nothing
	}

	@Override
	protected long getUid() {
		return 0;
	}

	@Override
	public int getPriority() {
		return 0;
	}


}
