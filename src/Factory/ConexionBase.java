package Factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConexionBase {
	
public DataSource datasou;


public ConexionBase() {
	ComboPooledDataSource comboPool = new ComboPooledDataSource();
	comboPool.setJdbcUrl("jdbc:mysql://localhost/hotel_alura_pe?serverTimezone=UTC&useLegacyDatetimeCode=false");
	comboPool.setUser("root");
	comboPool.setPassword("Rosamistica");
	
	this.datasou = comboPool;
}
public Connection recuperarConexion() {
	try {
		return this.datasou.getConnection();
	} catch (SQLException e) {
		System.out.println("Hubo un error");
		throw new RuntimeException(e);
	}
}
}
