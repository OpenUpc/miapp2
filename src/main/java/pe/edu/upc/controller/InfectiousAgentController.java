package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.InfectiousAgent;
import pe.edu.upc.serviceinterface.InfectiousAgentService;

@Named
@RequestScoped
public class InfectiousAgentController {
	@Inject
	private InfectiousAgentService iService;
	// Inject afecta solo al de arriba
	private InfectiousAgent i;
	List<InfectiousAgent> listaInfectiousAgents;
	
	
	@PostConstruct
	public void init() {
		System.out.println("INIT EJECUTANDOSE");
		this.listaInfectiousAgents = new ArrayList<>();
		this.i = new InfectiousAgent();
		list();		
	}
	//Puede ser llamado de una pagina JSF con el atributo "action" finalmente va hacia otra pagina
	public String newInfectious() {
		this.setI(new InfectiousAgent());
		return "infectiousAgent.xhtml";
	}
	
	public void list() {
		
		listaInfectiousAgents = iService.listar();
		
	}
	
	public void insert() {
		
		iService.insertar(i);	
		this.list();
	}
	
	public void cleanInfectiousAgent()
	{
		this.init();
	}
	
	

	public InfectiousAgentService getiService() {
		return iService;
	}

	public void setiService(InfectiousAgentService iService) {
		this.iService = iService;
	}

	public InfectiousAgent getI() {
		return i;
	}

	public void setI(InfectiousAgent i) {
		this.i = i;
	}

	public List<InfectiousAgent> getListaInfectiousAgents() {
		return listaInfectiousAgents;
	}

	public void setListaInfectiousAgents(List<InfectiousAgent> listaInfectiousAgents) {
		this.listaInfectiousAgents = listaInfectiousAgents;
	}

}
