package com.mercadv.commons.beans.seguridad;

import java.math.BigInteger;

public class Persona {

	public BigInteger idPersona;
	public String nombre;
	public String apePat;
	public String apeMat;
	public Usuario usuario;

	
	public BigInteger getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(BigInteger idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePat() {
		return apePat;
	}
	public void setApePat(String apePat) {
		this.apePat = apePat;
	}
	public String getApeMat() {
		return apeMat;
	}
	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
