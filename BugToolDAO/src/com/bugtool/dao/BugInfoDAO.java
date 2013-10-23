package com.bugtool.dao;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.bugtool.model.BugInfo;

/**
 * Home object for domain model class BugInfo.
 * @see com.bugmodel.dao.BugInfo
 * @author rsunkari
 */

@Repository
public class BugInfoDAO extends BaseDAO<BugInfo> {

	private static final Log log = LogFactory.getLog(BugInfoDAO.class);

	public BugInfoDAO() {
		super(BugInfo.class);
	}
	
}
