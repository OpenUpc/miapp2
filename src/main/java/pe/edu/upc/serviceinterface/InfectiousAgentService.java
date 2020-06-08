package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.InfectiousAgent;

public interface InfectiousAgentService {
	public void insertar(InfectiousAgent i);
	public List<InfectiousAgent> listar();
}
