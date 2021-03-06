package cl.clubhipico.clubhipico_jaraneda.controller;

import java.util.List;

import cl.clubhipico.clubhipico_jaraneda.object.CarreraObject;
import cl.clubhipico.clubhipico_jaraneda.util.DataBaseUtil;

public class CarreraController implements BaseController<CarreraObject>{

	private DataBaseUtil<CarreraObject> database = new DataBaseUtil<CarreraObject>();
	
	@Override
	public boolean insert(CarreraObject carrera) {
		// TODO Auto-generated method stub
		return database.insert(carrera);
	}

	@Override
	public boolean update(CarreraObject carrera) {
		// TODO Auto-generated method stub
		return database.update(carrera);
	}

	@Override
	public boolean delete(CarreraObject carrera) {
		// TODO Auto-generated method stub
		return database.delete(carrera);
	}

	@Override
	public CarreraObject select(CarreraObject carrera) {
		// TODO Auto-generated method stub
		return database.select(carrera);
	}

	@Override
	public List<CarreraObject> list(CarreraObject carrera) {
		// TODO Auto-generated method stub
		return database.list(carrera);
	}

	@Override
	public List<CarreraObject> list() {
		// TODO Auto-generated method stub
		return database.list();
	}

	

}
