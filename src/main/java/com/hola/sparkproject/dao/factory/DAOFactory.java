package com.hola.sparkproject.dao.factory;

import com.hola.sparkproject.dao.IAdBlacklistDAO;
import com.hola.sparkproject.dao.IAdClickTrendDAO;
import com.hola.sparkproject.dao.IAdProvinceTop3DAO;
import com.hola.sparkproject.dao.IAdStatDAO;
import com.hola.sparkproject.dao.IAdUserClickCountDAO;
import com.hola.sparkproject.dao.IAreaTop3ProductDAO;
import com.hola.sparkproject.dao.IPageSplitConvertRateDAO;
import com.hola.sparkproject.dao.ISessionAggrStatDAO;
import com.hola.sparkproject.dao.ISessionDetailDAO;
import com.hola.sparkproject.dao.ISessionRandomExtractDAO;
import com.hola.sparkproject.dao.ITaskDAO;
import com.hola.sparkproject.dao.ITop10CategoryDAO;
import com.hola.sparkproject.dao.ITop10SessionDAO;
import com.hola.sparkproject.dao.impl.AdBlacklistDAOImpl;
import com.hola.sparkproject.dao.impl.AdClickTrendDAOImpl;
import com.hola.sparkproject.dao.impl.AdProvinceTop3DAOImpl;
import com.hola.sparkproject.dao.impl.AdStatDAOImpl;
import com.hola.sparkproject.dao.impl.AdUserClickCountDAOImpl;
import com.hola.sparkproject.dao.impl.AreaTop3ProductDAOImpl;
import com.hola.sparkproject.dao.impl.PageSplitConvertRateDAOImpl;
import com.hola.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import com.hola.sparkproject.dao.impl.SessionDetailDAOImpl;
import com.hola.sparkproject.dao.impl.SessionRandomExtractDAOImpl;
import com.hola.sparkproject.dao.impl.TaskDAOImpl;
import com.hola.sparkproject.dao.impl.Top10CategoryDAOImpl;
import com.hola.sparkproject.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
	
	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
		return new AdUserClickCountDAOImpl();
	}
	
	public static IAdBlacklistDAO getAdBlacklistDAO() {
		return new AdBlacklistDAOImpl();
	}
	
	public static IAdStatDAO getAdStatDAO() {
		return new AdStatDAOImpl();
	}
	
	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
		return new AdProvinceTop3DAOImpl();
	}
	
	public static IAdClickTrendDAO getAdClickTrendDAO() {
		return new AdClickTrendDAOImpl();
	}
	
}
