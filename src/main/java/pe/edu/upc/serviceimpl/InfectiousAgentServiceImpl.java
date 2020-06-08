package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.InfectiousAgentDAO;
import pe.edu.upc.entity.InfectiousAgent;
import pe.edu.upc.serviceinterface.InfectiousAgentService;
@Named
@RequestScoped
public class InfectiousAgentServiceImpl implements InfectiousAgentService{
	
	@Inject
	private InfectiousAgentDAO iDao;

	@Override
	public void insertar(InfectiousAgent i) {
		iDao.insertar(i);			
	}

	@Override
	public List<InfectiousAgent> listar() {
		// TODO Auto-generated method stub
		return iDao.listar();
	}

}
