package com.lwshiwook.comskill.main;

import java.util.List;

import com.lwshiwook.comskill.battle.IGameUnit;
import com.lwshiwook.comskill.effect.IEffect;
import com.lwshiwook.comskill.support.SkillConfig;

public abstract class Skill {

	protected List<IEffect> effects;
	protected SkillConfig config;
	
	public List<IEffect> getEffects() {
		return effects;
	}

	public void setEffects(List<IEffect> effects) {
		effects.sort((a,b) -> {
			return a.getPriority() - b.getPriority();
		});
		this.effects = effects;
	}
	/**
	 * 更新方法
	 */
	public abstract void updatePulse();
	/**
	 * 组装方法
	 */
	public abstract void build(SkillConfig config, Object... param);
	/**
	 * 找受影响的目标
	 * @param effectUid
	 * @return
	 */
	public abstract List<IGameUnit> findEffected(long effectUid);
	
	/**
	 * 选择目标
	 * @param effect
	 * @return
	 */
	public abstract List<IGameUnit> aimTarget(IEffect effect);
	

}
