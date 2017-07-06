package cn.edu360;

import java.util.ArrayList;

/*
 * 2.在LOL游戏中，游戏中的用户应该用一个类来进行描述，比如，有以下属性信息：
		用户的游戏账号（比如： "朕御驾亲征痛杀之"）
		用户所在的对局ID（比如： "艾欧尼亚-1001"）
		用户所使用的英雄角色（比如： 易大师或者阿狸....）
		所装配的装备（装备应该可以是多个，比如"无尽之刃"、"狂徒铠甲"等）
		用户助攻数
		用户所杀的人头数
		斩杀小兵数
		用户的本局游戏实时得分（游戏得分=助攻数*10+击杀人头数*20+小兵数*2+装备件数*5）
		用户的历史累计得分
		用户的等级
		注：等级规则如下：
		累计得分---> [0-100]，等级1
		累计得分---> [101-200]，等级2
		.... 以此类推，最高等级为30级
		
		同时，需要具备以下方法：
		获取各属性值（如获取账号，对局ID，英雄角色名等）
		设置各属性值（如设置账号，对局ID，英雄角色名等）
		①　注：游戏实时得分值不应该直接设置，而是，当助攻数、人头数、斩杀小兵数、装备数发生变化时，对象自动更新游戏得分
		②　注：用户等级不应该直接设置，而是，根据当游戏历史总得分发生变化时，对象自动更新游戏等级
		
 */
public class LOL {
	/**用户的游戏账号*/
	private String account;
	/**用户所在的对局ID*/
	private String id;
	/**用户所使用的英雄角色*/
	private String hero;
	/**所装配的装备*/
	private ArrayList<String> equipment;
	/**用户助攻数*/
	private int ast;
	/**用户所杀的人头数*/
	private int killHeadCount;
	/**斩杀小兵数*/
	private int killBatmanCount;
	/**用户的本局游戏实时得分*/
	private int score;
	/**用户的历史累计得分*/
	private static int totalScore;
	/**用户的等级*/
	private int level;
	public LOL() {
		super();
	}
	public LOL(String account, String id, String hero, ArrayList<String> equipment, int ast, int killHeadCount,
			int killBatmanCount) {
		super();
		this.account = account;
		this.id = id;
		this.hero = hero;
		this.equipment = equipment;
		this.ast = ast;
		this.killHeadCount = killHeadCount;
		this.killBatmanCount = killBatmanCount;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public ArrayList<String> getEquipment() {
		return equipment;
	}
	public void setEquipment(ArrayList<String> equipment) {
		this.equipment = equipment;
	}
	public int getAst() {
		return ast;
	}
	public void setAst(int ast) {
		this.ast = ast;
	}
	public int getKillHeadCount() {
		return killHeadCount;
	}
	public void setKillHeadCount(int killHeadCount) {
		this.killHeadCount = killHeadCount;
	}
	public int getKillBatmanCount() {
		return killBatmanCount;
	}
	public void setKillBatmanCount(int killBatmanCount) {
		this.killBatmanCount = killBatmanCount;
	}
	public int getScore() {
		//游戏得分=助攻数*10+击杀人头数*20+小兵数*2+装备件数*5
		//当前的得分
		int temp = getAst()*10+getKillHeadCount()*20+getKillBatmanCount()*2+(getEquipment()==null?0:getEquipment().size()*5);
		//计算一下，本次得分比上次多了多少分
		int n = temp-score;
		//历史累计得分
		totalScore+=n;
		score = temp;
		return score;
	}
	public int getTotalScore() {
		//再获取历史得分的时候，需要手动调用getScore方法，主动的计算历史得分
		getScore();
		return totalScore;
	}
	public int getLevel() {
		/*
		 * 注：等级规则如下：
			累计得分---> [0-100]，等级1
			累计得分---> [101-200]，等级2
			.... 以此类推，最高等级为30级
		 */
		int n = getTotalScore();
		level = (int) Math.ceil(n/100.0);
		if(level==0){
			level = 1;
		}else if(level>30){
			level = 30;
		}
		return level;
	}
	
	@Override
	public String toString() {
		return "LOL [游戏账号=" + account + ", 对局信息=" + id + ", 使用英雄=" + hero + ", 装备信息=" + (getEquipment()==null?"没有装备":getEquipment().toString()) + ", 助攻数=" + ast
				+ ", 击杀数=" + killHeadCount + ", 补兵数=" + killBatmanCount + ", 当前得分=" + getScore()
				+ ", 累计得分=" + getTotalScore() + ", 用户等级=" + getLevel() + "]";
	}
	
}
