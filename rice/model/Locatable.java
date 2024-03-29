/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rice.model;
import rice.model.map.ATVisitorAcceptor;
import rice.model.map.AreaTile;
import rice.model.map.AreaTileVisitor;
import rice.util.Position;

/**
 *
 * @author Marcos
 */
public abstract class Locatable implements ATVisitorAcceptor {
    private AreaTile areaTile;
    private String typeName;

    public Locatable(String typeName)
    {
    	this.typeName=typeName;
    }
    
    public String getTypeName() {
        return typeName;
    }
    
    public Position getLocation()
    {
    	if(this.getTile()!=null)
    	{
    		return this.getTile().getPosition();
    	}
    	else
    	{
    		return null;
    	}
    }
    
    public AreaTile getTile()
    {
    	return this.areaTile;
    }
    
    public void setTile(AreaTile areaTile)
    {
    	this.areaTile=areaTile;
    }
    
	public void accept(AreaTileVisitor v)
	{
		v.visit(this);
	}
 
}
