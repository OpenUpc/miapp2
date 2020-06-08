package pe.edu.upc.conexion;

import java.util.Date;

import pe.edu.upc.daoimpl.InfectiousAgentImpl;
import pe.edu.upc.daointerface.InfectiousAgentDAO;
import pe.edu.upc.entity.InfectiousAgent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InfectiousAgentDAO agentDAO = new InfectiousAgentImpl();
		InfectiousAgent infectiousAgent = new InfectiousAgent();
		infectiousAgent.setDescriptionInfectiousAgents("Raro");
		infectiousAgent.setTimeInfectiousAgents(10);
		infectiousAgent.setTypeInfectiousAgents("Virus");
		infectiousAgent.setAppearanceDateInfectiousAgents(new Date());
		agentDAO.insertar(infectiousAgent);
		System.out.println("Terminado");

	}

}
