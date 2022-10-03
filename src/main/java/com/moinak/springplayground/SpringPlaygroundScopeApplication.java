package com.moinak.springplayground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moinak.springplayground.basic.MessagePrinter;
import com.moinak.springplayground.basic.MessagePrinterImpl;
import com.moinak.springplayground.scope.JDBCConnection;
import com.moinak.springplayground.scope.OrderDAO;

@SpringBootApplication
public class SpringPlaygroundScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringPlaygroundScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(SpringPlaygroundScopeApplication.class, args);
		
		OrderDAO orderDao1 = app.getBean(OrderDAO.class);
		OrderDAO orderDao2 = app.getBean(OrderDAO.class);
		
		JDBCConnection jdbcConnection1 = orderDao1.getJdbcConnection();
		JDBCConnection jdbcConnection2 = orderDao2.getJdbcConnection();
		
		LOGGER.info("{}",orderDao1);
		LOGGER.info("{}",jdbcConnection1);
		LOGGER.info("{}",orderDao2);
		LOGGER.info("{}",jdbcConnection2);
	}

}
