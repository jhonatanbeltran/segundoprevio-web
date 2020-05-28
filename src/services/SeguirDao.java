package services;

import entities.Seguir;
import util.Conexion;

public class SeguirDao extends Conexion<Seguir> implements GenericDao<Seguir> {

	public SeguirDao() {
		super(Seguir.class);
		// TODO Auto-generated constructor stub
	}

}
