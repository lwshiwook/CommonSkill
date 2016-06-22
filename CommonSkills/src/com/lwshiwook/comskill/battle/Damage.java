package com.lwshiwook.comskill.battle;

import com.lwshiwook.comskill.support.DamageType;

/**
 * 伤害
 * @author liwei
 *
 */
public class Damage implements IAtkPack {

	private int damage;
	private DamageType dmType;
	private long affectTime;

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public DamageType getDmType() {
		return dmType;
	}

	public void setDmType(DamageType dmType) {
		this.dmType = dmType;
	}

	@Override
	public boolean engage(long nowTime) {
		if (nowTime >= affectTime) {
			return true;
		}
		return false;
	}
}
