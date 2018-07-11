package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;

public class Recaudaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idRec;
    
    private String moneda;
    
    private String numero;
    
    private double importe;
    
    private String carnet;
    
    private String autoseguro;
    
    private String ave;
    
    private String devolTran;
    
    private String observacion;
    
    private Date fecha;
    
    private Boolean validado;
        
    private Integer idAlum;
    
    private String codAlumno; 

    private Integer idPrograma;
    
    private Integer idConcepto;
    
    private Integer idRegistro;
    
    private Integer idTipo;
    
    private Integer idUbicacion;

    public Recaudaciones() {
    }

	public Integer getIdRec() {
		return idRec;
	}

	public void setIdRec(Integer idRec) {
		this.idRec = idRec;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getAutoseguro() {
		return autoseguro;
	}

	public void setAutoseguro(String autoseguro) {
		this.autoseguro = autoseguro;
	}

	public String getAve() {
		return ave;
	}

	public void setAve(String ave) {
		this.ave = ave;
	}

	public String getDevolTran() {
		return devolTran;
	}

	public void setDevolTran(String devolTran) {
		this.devolTran = devolTran;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getValidado() {
		return validado;
	}

	public void setValidado(Boolean validado) {
		this.validado = validado;
	}

	public Integer getIdAlum() {
		return idAlum;
	}

	public void setIdAlum(Integer idAlum) {
		this.idAlum = idAlum;
	}

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public Integer getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(Integer idPrograma) {
		this.idPrograma = idPrograma;
	}

	public Integer getIdConcepto() {
		return idConcepto;
	}

	public void setIdConcepto(Integer idConcepto) {
		this.idConcepto = idConcepto;
	}

	public Integer getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRec == null) ? 0 : idRec.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recaudaciones other = (Recaudaciones) obj;
		if (idRec == null) {
			if (other.idRec != null)
				return false;
		} else if (!idRec.equals(other.idRec))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recaudaciones [idRec=" + idRec + ", moneda=" + moneda + ", numero=" + numero + ", importe=" + importe
				+ ", carnet=" + carnet + ", autoseguro=" + autoseguro + ", ave=" + ave + ", devolTran=" + devolTran
				+ ", observacion=" + observacion + ", fecha=" + fecha + ", validado=" + validado + ", idAlum=" + idAlum
				+ ", codAlumno=" + codAlumno + ", idPrograma=" + idPrograma + ", idConcepto=" + idConcepto
				+ ", idRegistro=" + idRegistro + ", idTipo=" + idTipo + ", idUbicacion=" + idUbicacion + "]";
	}
    
}
