package com.bugtool.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.bugtool.model.UserInfo;

/**
 * Home object for domain model class UserInfo.
 * 
 * @see com.bugmodel.dao.UserInfo
 * @author rsunkari
 */
@Repository("userInfoDAO")
public class UserInfoDAO extends BaseDAO<UserInfo> {
	
	public UserInfoDAO() {
		super(UserInfo.class);
	}

	public boolean checkUserLogin(String email, String password) {
		boolean success = false;
		email = "'" + email + "'";
		password = "'" + password +"'";

		/*
		 * Criteria userCheckCriteria =
		 * getCurrentSession().createCriteria(UserInfo.class);
		 * userCheckCriteria.add(Restrictions.eq("emailid", email));
		 * Restrictions.and(Restrictions.eq("emailid", email),
		 * Restrictions.eq("pwwd",password)); Criterion emailId =
		 * Restrictions.eq("emailid", email); Criterion pass =
		 * Restrictions.eq("pwwd",password);
		 */

		success = find(Restrictions.and(Restrictions.eq("emailid", email),
				Restrictions.eq("pswd", password))).size() > 0 ? true : false;

		return success;
	}
	
	public List<UserInfo> find(Criterion criterion) {
        Criteria criteria = getCurrentSession().createCriteria(UserInfo.class);
        criteria.add(criterion);
        return criteria.list();
    }

}
