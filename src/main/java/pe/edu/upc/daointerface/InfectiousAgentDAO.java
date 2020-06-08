package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.InfectiousAgent;

public interface InfectiousAgentDAO {
	public void insertar(InfectiousAgent infectiousAgent);
	public List<InfectiousAgent> listar();
}
