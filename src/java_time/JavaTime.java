package java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaTime {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataEspecifica1 = LocalDate.of(2023, 1, 12);

		LocalDate dataEspecifica2 = LocalDate.of(2023, Month.JANUARY, 12);
		System.out.println(dataAtual);
		// Representação de um LocalDate: 2023-03-01

		// este conteúdo pode ser um argumento de seu programa via console
		// ou toString() de algum componente visualj
		String stringData = "2023-01-17";

		LocalDate dataConcreta = LocalDate.parse(stringData);

		String stringDataBr = "17/01/2023";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dataConcreta1 = LocalDate.parse(stringDataBr, formatter);

		LocalDate data1 = LocalDate.of(2023, 3, 4);
		LocalDate data2 = LocalDate.of(2024, 4, 3);

		// data2 está após a data 1? true
		System.out.println(data2.isAfter(data1));

		// data2 está antes que data 1? flase
		System.out.println(data2.isBefore(data1));
		
		// data2 é igual a data 1? false
		System.out.println(data2.isEqual(data1));

		LocalDate data = LocalDate.of(2023, 1, 13);

		String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)); // 13 de janeiro de
																									// 2023
		dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)); // 13 de jan. de 2023
		dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); // 13/01/2023
		dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)); // sexta-feira, 13 de janeiro
																							// de 2023

		LocalDate data21 = LocalDate.of(2021, 8, 23);

		Locale[] locales = { Locale.CANADA, Locale.US, new Locale("fi", "FI"), Locale.UK };

		for (Locale locale : locales) {
			String dataFormatada1 = data21.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
			System.out.println(dataFormatada1);
		}

		// 2021-08-23
		// 8/23/21
		// 23.8.2021
		// 23/08/2021
		LocalTime horaAtual = LocalTime.now();

		LocalTime horaMinutoSegundoEspecifico = LocalTime.of(13, 21, 42); // 13:21:42

		LocalTime horaMinutoEspecifico = LocalTime.of(13, 21); // 13:21

		LocalTime horaDeUmaString = LocalTime.parse("13:21:42");

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HHmmss");
		LocalTime horaDeUmaStringDespadronizada = LocalTime.parse("132142", formatter1); // 13:21:42

		LocalTime hora = LocalTime.of(13, 21, 42);

		System.out.println(hora.getHour()); // 13
		System.out.println(hora.getMinute()); // 21
		System.out.println(hora.getSecond()); // 42
		System.out.println(hora.getNano()); // 0

		LocalDateTime dataHora1 = LocalDateTime.of(2023, 6, 25, 16, 25);
		LocalDateTime dataHora2 = LocalDateTime.of(2023, 6, 25, 16, 25, 17);

		// comparando dois objetos data/hora em sua totalidade
		boolean dataHoraIgual = dataHora1.equals(dataHora2); // false

		// comparando dígito específico de uma data e hora
		boolean dataHoraDigitoIgual = dataHora1.getDayOfMonth() == dataHora2.getDayOfMonth(); // true

	}
}
