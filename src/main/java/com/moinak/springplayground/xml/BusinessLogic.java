package com.moinak.springplayground.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessLogic {
	
	private Logger logger = LoggerFactory.getLogger(BusinessLogic.class);
	
	private OrderDAO orderDao;
	
	public void checkBeans() {
		logger.info("BusinessLogic bean: " + this);
		logger.info("OrderDAO bean: " + this.getOrderDao());
		logger.info("JdbcConnection bean: " + this.getOrderDao().getJdbcConnection());
		logger.info("JdbcConnection ID: " + this.getOrderDao().getJdbcConnection().getId());
	}

	public OrderDAO getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDAO orderDao) {
		this.orderDao = orderDao;
	}
}
