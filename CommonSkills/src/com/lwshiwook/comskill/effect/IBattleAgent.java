package com.lwshiwook.comskill.effect;

import java.util.List;

import org.gof.demo.battlesrv.stageObj.UnitObject;

/**
 * 职能  关键帧发消息 选择目标 战场信息
 * @author Wayne
 *
 */
public interface IBattleAgent {

	List<UnitObject> findEffected(long effectUid);

}
