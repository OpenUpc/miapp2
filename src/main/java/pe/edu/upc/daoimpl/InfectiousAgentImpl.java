package pe.edu.upc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.conexion.Conexion;
import pe.edu.upc.daointerface.InfectiousAgentDAO;
import pe.edu.upc.entity.InfectiousAgent;

public class InfectiousAgentImpl implements InfectiousAgentDAO {

	private Connection oCn;

	public InfectiousAgentImpl() {
		
	}

	@Override
	public void insertar(InfectiousAgent infectiousAgent) {
		String sql = "insert into infectiousagents (descriptionInfectiousAgents, typeInfectiousAgents, " //faltó coma
				+ "timeOfLifeInfectiousAgents, appearanceDateInfectiousAgents) values (?, ?, ?, ?)";
		try {
			oCn = Conexion.AbrirConexion();
			PreparedStatement ps = oCn.prepareStatement(sql);
			ps.setString(1, infectiousAgent.getDescriptionInfectiousAgents());
			ps.setString(2, infectiousAgent.getTypeInfectiousAgents());
			ps.setInt(3, infectiousAgent.getTimeInfectiousAgents());
			ps.setDate(4, new java.sql.Date(infectiousAgent.getAppearanceDateInfectiousAgents().getTime()));
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Conexion.CerrarConexion();
		}

	}

	@Override
	public List<InfectiousAgent> listar() {
		List<InfectiousAgent> lista = new ArrayList<>();
		try {
			String sql = "select * from infectiousagents";
			oCn = Conexion.AbrirConexion();
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				InfectiousAgent i = new InfectiousAgent();
				i.setIdInfectiousAgents(rs.getInt("idInfectiousAgents"));
				i.setDescriptionInfectiousAgents(rs.getString("descriptionInfectiousAgents"));
				i.setTypeInfectiousAgents(rs.getString("typeInfectiousAgents"));
				i.setTimeInfectiousAgents(rs.getInt("timeOfLifeInfectiousAgents"));
				i.setAppearanceDateInfectiousAgents(rs.getDate("appearanceDateInfectiousAgents"));
				lista.add(i);
			}
		} catch (Exception e) {
          System.out.println(e.getMessage());
		}finally {
			Conexion.CerrarConexion();
		}

		return lista;
	}

}
