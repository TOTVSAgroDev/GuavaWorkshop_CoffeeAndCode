package main;

import java.util.List;
import com.google.common.base.Charsets;
import com.totvs.agridatagenerator.framework.loggers.AgriDataLoggerBO;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.vo.FazendaVO;

public class Main {

	public static void main(String[] args) {
		try {

			List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

			AgriDataLoggerBO.log(fazendas);

		} catch (Exception e) {
		}
	}

}
