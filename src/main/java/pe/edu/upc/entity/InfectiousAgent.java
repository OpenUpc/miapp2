package pe.edu.upc.entity;

import java.util.Date;

public class InfectiousAgent {
	private int idInfectiousAgents;
	private String descriptionInfectiousAgents;
	private String typeInfectiousAgents;
	private int timeInfectiousAgents;
	private Date appearanceDateInfectiousAgents;
	
	
	public InfectiousAgent(int idInfectiousAgents, String descriptionInfectiousAgents, String typeInfectiousAgents,
			int timeInfectiousAgents, Date appearanceDateInfectiousAgents) {
		super();
		this.idInfectiousAgents = idInfectiousAgents;
		this.descriptionInfectiousAgents = descriptionInfectiousAgents;
		this.typeInfectiousAgents = typeInfectiousAgents;
		this.timeInfectiousAgents = timeInfectiousAgents;
		this.appearanceDateInfectiousAgents = appearanceDateInfectiousAgents;
	}
	public InfectiousAgent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdInfectiousAgents() {
		return idInfectiousAgents;
	}
	public void setIdInfectiousAgents(int idInfectiousAgents) {
		this.idInfectiousAgents = idInfectiousAgents;
	}
	public String getDescriptionInfectiousAgents() {
		return descriptionInfectiousAgents;
	}
	public void setDescriptionInfectiousAgents(String descriptionInfectiousAgents) {
		this.descriptionInfectiousAgents = descriptionInfectiousAgents;
	}
	public String getTypeInfectiousAgents() {
		return typeInfectiousAgents;
	}
	public void setTypeInfectiousAgents(String typeInfectiousAgents) {
		this.typeInfectiousAgents = typeInfectiousAgents;
	}
	public int getTimeInfectiousAgents() {
		return timeInfectiousAgents;
	}
	public void setTimeInfectiousAgents(int timeInfectiousAgents) {
		this.timeInfectiousAgents = timeInfectiousAgents;
	}
	public Date getAppearanceDateInfectiousAgents() {
		return appearanceDateInfectiousAgents;
	}
	public void setAppearanceDateInfectiousAgents(Date appearanceDateInfectiousAgents) {
		this.appearanceDateInfectiousAgents = appearanceDateInfectiousAgents;
	}
	
	
	

}
