package com.lwshiwook.comskill.main;

import java.util.List;

import com.lwshiwook.comskill.battle.IBattleAgent;
import com.lwshiwook.comskill.battle.IGameUnit;
import com.lwshiwook.comskill.effect.IEffect;
import com.lwshiwook.comskill.support.SkillConfig;

public class BuffSkill extends Skill {
	
	private long createTime; //buff创建时间
	private long timeDuring; //buff持续时间
	private int isDispelable; //是否可驱散
	
	private BuffSkill(){}
	
	public long getTimeLeft(long timeNow) {
		return timeDuring - (timeNow - createTime);
	}

	public int getIsDispelable() {
		return isDispelable;
	}

	public void setIsDispelable(int isDispelable) {
		this.isDispelable = isDispelable;
	}
	
	public void apply(){
		effects.forEach(c -> {
			c.doEffect(aimTarget(c));
		});
	}
	
	public void dispel(IBattleAgent ba){
		
		effects.forEach(c -> {
			long effectUid = c.getUid();
			List<IGameUnit> effected = findEffected(effectUid);
			c.recover(effected);
		});
	}

	@Override
	public void updatePulse() {
		
	}

	@Override
	public void build(SkillConfig config, Object... param) {
		
	}

	@Override
	public List<IGameUnit> findEffected(long effectUid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IGameUnit> aimTarget(IEffect effect) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
