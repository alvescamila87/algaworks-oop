package avancados.datas.desafio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
	
	/**
	 * A médica deseja informar apenas a data do último período menstrual de sua cliente e o software 
	 * deve calcular e exibir a data estimada do parto e a data estimada da concepção 
	 * (isso mesmo que você está pensando... o ato sexual).
	 * 
	 * A data estimada da concepção é igual a data do último período menstrual mais 2 semanas.
	 * A data estimada do parto é igual a data do último período menstrual mais 40 semanas.
	 */
	
	private Date dataUltimoPeriodoMestrual;
	
	public CalculadoraGravidez(Date dataUltimoPeriodoMestrual) {
		this.dataUltimoPeriodoMestrual = dataUltimoPeriodoMestrual;
	}
	
	public Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
	public Date calcularDataEstimadaConcepcao() {
		// implementar cálculo de data estimada da concepção
		// 2 semanas após a data do último período menstrual
		
		Calendar dataEstimadaDeConcepcao = converterDateParaCalendar(dataUltimoPeriodoMestrual);
		dataEstimadaDeConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		return dataEstimadaDeConcepcao.getTime();
	}
	
	public Date calcularDataEstimadaParto() {
		// implementar cálculo de data estimada para parto
		// 40 semanas após a data do último período menstrual
		
		Calendar dataEstimadaDeParto = converterDateParaCalendar(dataUltimoPeriodoMestrual);
		dataEstimadaDeParto.add(Calendar.WEEK_OF_YEAR, 40);
		return dataEstimadaDeParto.getTime();	
	}
	
	

}
