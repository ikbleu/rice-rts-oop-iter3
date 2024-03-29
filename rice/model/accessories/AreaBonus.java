package rice.model.accessories;

import rice.model.Controllable;
import rice.model.map.ModifierVisitor;

public class AreaBonus extends Modifier
{
	private String type;
	private BonusGiver owner;
	private int radius;
	
	public AreaBonus(String type, BonusGiver owner, int radius)
	{
		super("AreaBonus");
		this.type=type;
		this.owner=owner;
		this.radius=radius;
	}
	
	//returns the bonus for the controllable
	public int getBonus(Controllable c)
	{
		return this.owner.getBonus(this.type, this.radius, c);
	}

	//returns the bonus type
	public String getType()
	{
		return this.type;
	}
	
	public void accept(ModifierVisitor v)
	{
		v.visit(this);
	}	
}
