package com.cursospring.T2M4.servicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class FechaHoraImpl implements FechaHora{
	public String obtenFechaHora(){
		DateFormat dateformat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		return dateformat.format(new Date());
	}
}
