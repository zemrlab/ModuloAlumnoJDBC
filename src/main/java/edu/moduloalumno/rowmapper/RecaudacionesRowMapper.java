package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Recaudaciones;

public class RecaudacionesRowMapper implements RowMapper<Recaudaciones> {
	@Override
	public Recaudaciones mapRow(ResultSet row, int rowNum) throws SQLException {
		Recaudaciones recaudaciones = new Recaudaciones();
		recaudaciones.setIdRec(row.getInt("id_rec"));
		recaudaciones.setMoneda(row.getString("moneda"));
		recaudaciones.setNumero(row.getString("numero"));
		recaudaciones.setImporte(row.getInt("importe"));
		recaudaciones.setCarnet(row.getString("carnet"));
		recaudaciones.setAutoseguro(row.getString("autoseguro"));
		recaudaciones.setAve(row.getString("ave"));
		recaudaciones.setDevolTran(row.getString("devol_tran"));
		recaudaciones.setObservacion(row.getString("observacion"));
		recaudaciones.setFecha(row.getDate("fecha"));
		recaudaciones.setValidado(row.getBoolean("validado"));
		recaudaciones.setIdAlum(row.getInt("id_alum"));
		recaudaciones.setIdConcepto(row.getInt("id_concepto"));
		recaudaciones.setIdRegistro(row.getInt("id_registro"));
		recaudaciones.setIdPrograma(row.getInt("id_programa"));
		recaudaciones.setCodAlumno(row.getString("cod_alumno"));
		recaudaciones.setIdUbicacion(row.getInt("id_ubicacion"));
		recaudaciones.setIdTipo(row.getInt("id_tipo"));
		return recaudaciones;
	}
}